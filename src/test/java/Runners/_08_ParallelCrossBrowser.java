package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, //buraya feature files ın path i verilecek. sağ tık-copy path-path from content root
        glue = {"StepDefinitions"} // Step definitions ın klasörü adı yazılıyor.
)
public class _08_ParallelCrossBrowser extends AbstractTestNGCucumberTests {//extends gerekir
    @BeforeClass
    @Parameters("BrowserTipi")
    public void beforeClass(String BrowserName){ // tarayıcı tipini, _08_ParallelCrossBrowser classı çalışmadan önce set etmek için beforeclass yazdık.
        GWD.setThreadBrowserName(BrowserName);
    }

}
