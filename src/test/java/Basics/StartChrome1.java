package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StartChrome1 {

    WebDriver driver;

    @Test
    public void verifyLonginSucess(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText,"Products");

        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        driver.findElement(By.id("add-to-cart")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Rixongile");
        driver.findElement(By.id("last-name")).sendKeys("Baloyi");
        driver.findElement(By.id("postal-code")).sendKeys("1709");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        // Print the title of the page
        String pageTitle = driver .getTitle();
        System.out.println("Page Title: " + pageTitle);

    }
}


