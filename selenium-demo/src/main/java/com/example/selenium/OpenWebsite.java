package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/manvendra/Downloads/chromedriver");

        WebDriver driver = null;
        boolean testPassed = false;
        try {
            driver = new ChromeDriver();
            driver.get("https://devando.onrender.com/index.html");
            Thread.sleep(5000); // View the page
            testPassed = true;
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
            if (testPassed) {
                System.out.println("Test passed: Website opened and closed successfully.");
            }
        }
    }
}
