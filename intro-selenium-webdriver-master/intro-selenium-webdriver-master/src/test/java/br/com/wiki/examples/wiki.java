package br.com.wiki.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wiki {


    @Test   

    public void testGoogleSearch() throws InterruptedException {     

    System.setProperty("webdriver.chrome.driver", "C:/Users/2902798166/Documents/chromedriver.exe");           WebDriver driver = new ChromeDriver(); 

    driver.get("https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal");    

    Thread.sleep(5000);  // Let the user actually see something!     

    WebElement searchBox = driver.findElement(By.name("search"));

    searchBox.sendKeys("Beyonce");     

    searchBox.submit();    

    Thread.sleep(5000);
    
    WebElement birthdayDate = driver.findElement(By.cssSelector("#mw-content-text > div.mw-parser-output > table.infobox.infobox_v2 > tbody > tr:nth-child(5) > td:nth-child(2) > span > a:nth-child(1)"));
    
    String birthdayDateTrue = "4 de setembro";
    
    assertEquals(birthdayDateTrue, birthdayDate.getText());

        
    driver.quit();  

    } 

}