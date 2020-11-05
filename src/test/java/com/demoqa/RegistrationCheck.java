package com.demoqa;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class RegistrationCheck {
    @Test
    public void registrationcheck(){

        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        driver.findElementById("firstName").sendKeys("Anton");

        driver.findElementById("lastName").sendKeys("Tuhusov");

        driver.findElementById("userEmail").sendKeys("anton.tuhusov@gmail.com");

        driver.findElementByXPath("//label[@for=\"gender-radio-1\"]").click();

        driver.findElementById("userNumber").sendKeys("0500118706");

        driver.findElementById("dateOfBirthInput").click();
        Select drpMonth = new Select(driver.findElementByClassName("react-datepicker__month-select"));
        drpMonth.selectByVisibleText("August");
        Select drpYear = new Select(driver.findElementByClassName("react-datepicker__year-select"));
        drpYear.selectByVisibleText("1999");
        driver.findElementByXPath("//div[@aria-label='Choose Saturday, August 7th, 1999']").click();

        driver.findElementByXPath("//input[@id=\"subjectsInput\"]").sendKeys("Ma");
        driver.findElementByXPath("//input[@id=\"subjectsInput\"]").sendKeys(Keys.ENTER);

        driver.findElementByXPath("//label[@for=\"hobbies-checkbox-1\"]").click();

        WebElement UploadImg = driver.findElementById("uploadPicture");
        UploadImg.sendKeys("C:\\Users\\Сметанник\\Pictures\\1.jpg");

        driver.findElementById("currentAddress").sendKeys("Kharkiv,nauki,22");

        driver.findElementByXPath("//div[text()='Select State']").click();
        driver.findElementByXPath("//div[text()='Uttar Pradesh']").click();

        driver.findElementByXPath("//div[text()='Select City']").click();
        driver.findElementByXPath("//div[text()='Agra']").click();

        driver.findElementByXPath("//button[@id=\"submit\"]").click();

    }

}
