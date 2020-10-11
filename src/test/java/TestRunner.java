import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"util.hooks", "steps"},
        //tags = {"~@Ignore"},
        plugin = {"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"}
)

public class TestRunner extends  AbstractTestNGCucumberTests{
    @Parameters({"feature"})
    @BeforeTest(alwaysRun = true)
    public void setUpTest(@Optional("src/test/java/features") String feature) throws Exception {
        Class<?> testClass = this.getClass();
        changeCucumberAnnotation(testClass, "features", new String [] { "src/test/java/features/" + feature});
    }

    private static void changeCucumberAnnotation(Class<?> clazz, String key, Object newValue) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        //get the CucumberOptions annotation
        Annotation options = clazz.getAnnotation(CucumberOptions.class);

        //setup handler so we can update Annotation using reflection. Basically creates a proxy for the Cucumber Options class
        InvocationHandler proxyHandler = Proxy.getInvocationHandler(options);

        //the annotaton key/values are stored in the memberValues field
        Field f = proxyHandler.getClass().getDeclaredField("memberValues");

        //suppress any access issues when looking at f
        f.setAccessible(true);

        //get the key-value map for the proxy
        Map<String, Object> memberValues = (Map<String, Object>) f.get(proxyHandler);

        //remove the key entry...don't worry, we'll add it back
        memberValues.remove(key);

        //add the new key-value pair. The annotation is now updated.
        memberValues.put(key,newValue);
    }

}
