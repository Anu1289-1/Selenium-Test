package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebsite {
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();  // Dynamically sets up the driver
        WebDriver driver = new ChromeDriver();
        
        boolean testPassed = false;
        
        try {
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
