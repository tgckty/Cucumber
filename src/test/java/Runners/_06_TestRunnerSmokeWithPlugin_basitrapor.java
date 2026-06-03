package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //"@SmokeTest or @Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/site/cucumber-pretty.html"} //bu eklenen plugin ile bu yola html formatında bir test raporu oluşturur.
)
public class _06_TestRunnerSmokeWithPlugin_basitrapor extends AbstractTestNGCucumberTests {
}
