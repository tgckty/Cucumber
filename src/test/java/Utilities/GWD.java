package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
                case "chrome":
                    threadDriver.set(new ChromeDriver()); break; // bu hatta bir driver set et
                case "edge":
                    threadDriver.set(new EdgeDriver()); break;
                default:
                    threadDriver.set(new ChromeDriver());
            }

            threadDriver.get().manage().window().maximize(); // Ekranı max yapıyor.
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        }

        return threadDriver.get();
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
