package org.example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {

    public static void main(String[] args) throws MalformedURLException {
        //1) Desired Capabilities OLUSTUR
        DesiredCapabilities cap =new DesiredCapabilities();

        //2) Desired Capabilities icerisinde 3 sey tanımlıycaz
        //a) browser

        cap.setBrowserName("chrome");

        //b) isletim sistemi

        cap.setPlatform(Platform.WINDOWS);

        //c) browser versiyon

        //cap.setVersion("96.0.4664.45");

        ChromeOptions options= new ChromeOptions();

        String hubUrl = "http://192.168.0.12:4444/wd/hub";

        WebDriver driver=new RemoteWebDriver(new URL(hubUrl), options);

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }
}
