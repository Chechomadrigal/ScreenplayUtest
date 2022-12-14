package co.com.chechosychechos.ti.utest.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriversWeb {
    private static WebDriver driver;
    public static MyDriversWeb chrome(){
        System.setProperty("webchromedriver","chromedriver.exe");//configura el driver que se va a usar
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        return new MyDriversWeb();

    }
    public WebDriver inThePage(String url){
        driver.get(url);
        return driver;
    }


}
