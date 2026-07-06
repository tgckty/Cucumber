package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    //genel web driver dedik adına

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        //system i tamamen ingilizceye çalıştır
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get() == null)// XMLden çalıştırılmayan diğer testlerde tarayıcı boş geldiğinde
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null)//bu hatta driver yok ise
        {
            switch (threadBrowserName.get()) {
                case "firefox":
                    threadDriver.set(new ChromeDriver()); break; // bu hatta bir driver set et
                case "edge":
                    threadDriver.set(new EdgeDriver()); break;
                default:
                    if (isRunningOnJenkins()){

                        //aşağıdaki 2 satır jenkins içinb eklendi
                        ChromeOptions ChromeOptions = new ChromeOptions();
                        ChromeOptions.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");

                        threadDriver.set(new ChromeDriver(ChromeOptions));
                    }
                    else
                    threadDriver.set(new ChromeDriver());
            }

            threadDriver.get().manage().window().maximize(); // Ekranı max yapıyor.
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        }

        return threadDriver.get();
    }
    public static boolean isRunningOnJenkins() {
        String jenkinsHome = System.getenv("JENKINS_HOME");
        return jenkinsHome != null && !jenkinsHome.isEmpty();
    }
    public static void quitDriver() {
        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get(); // hattaki driver ı ver
            driver = null;  // içini boşalt
            threadDriver.set(driver);  // tekrar ilgili iş hattına ver
        }
    }

    public static void setThreadBrowserName(String browserName) {
        threadBrowserName.set(browserName);
    }
}
