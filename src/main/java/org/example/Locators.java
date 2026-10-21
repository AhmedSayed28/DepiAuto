package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
    static void main(String[] args) throws InterruptedException {
        // options
        ChromeOptions options = new ChromeOptions();
        // add incognito
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/"); // login page

        // id = user-name
        WebElement usernameInput = driver.findElement(By.xpath("//input[@data-test=\"username\"]"));
        // id = password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@data-test=\"password\"]"));
        // id = login-button
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test=\"login-button\"]"));

        //actions
        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();


//        String CurrentURL  = driver.getCurrentUrl(); // https://www.saucedemo.com/inventory.html
//
//        if (CurrentURL.contains("inventory.html")){
//            System.out.println("PASSED");
//        }else {
//            System.out.println("FAILED");
//        }

        WebElement productsHeader = driver.findElement(By.xpath("//span[@data-test=\"title\"]"));


        if (productsHeader.isDisplayed()){
              System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

    }
}
