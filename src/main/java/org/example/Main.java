package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static void main() {
        WebDriver driver = new ChromeDriver();

        // Window Management

        // minimize
        // maximize
        // Fullscreen
        // setSize


        driver.manage().window().maximize();

//        driver.manage().window().minimize();
//
//        driver.manage().window().setSize(new Dimension(360 , 820));
//
//        driver.manage().window().fullscreen();


        // Get and Her sisters

        driver.get("https://www.facebook.com");

//        System.out.println(driver.getCurrentUrl());
//
//        System.out.println(driver.getTitle());
//
//        System.out.println(driver.getPageSource());


        // Navigate Methods

//        driver.navigate().back();

//        driver.navigate().forward();

//        driver.navigate().refresh();

//        driver.navigate().to("https://www.linkedin.com/pub/dir/+/+?trk=guest_homepage-basic_guest_nav_menu_people");


        // Quit , Close

//        driver.quit();

        driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.linkedin.com");


        driver.close();


        driver.quit();

    }
}
