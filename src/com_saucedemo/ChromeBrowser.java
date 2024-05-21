package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

public class ChromeBrowser {

    //Main Method
    public static void main(String[] args) {

        //Base Url
        String baseUrl = "https://www.saucedemo.com/";

        //1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open Url
        driver.get(baseUrl);

        //Maximise the browser window
        driver.manage().window().maximize();

        //Giving implicit wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //3. Print the title of the page.
        System.out.println("Title of the page: " + driver.getTitle());

        //4. Print the current url.
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        //6. Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("Prime_Prm");

        //7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("Prime");

        //8. Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //9. Print the current url.
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();


    }
}
