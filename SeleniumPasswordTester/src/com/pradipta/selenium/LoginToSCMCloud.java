package com.pradipta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToSCMCloud {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","D:\\WorkSpace\\EclipseLunaOEPE\\SeleniumPasswordTester\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		String url = "https://ucf1-fap0877-fs.oracledemos.com/homePage/faces/FuseWelcome?fndThemeName=Vision";
		//String url = "https://ucf1-fap0877-idm.oracledemos.com/oam/server/obrareq.cgi?encquery%3DwWIilG5I0ADb1juaaUi4VxXgSmjI5UN3jGj1OhbnuFvkrbLywTUC5RZf1iVi0GgNLvS%2F55sXfj8OvHpOYYoH%2Fj5DpgQMp7u1HrdSRIm73KGOaaAhK%2BIKrIgqdbOlIsh8zmST6cciHfBnfZvO%2B38qjCoMuuGMn%2FT3wjom3hIo7JI84WEM0U%2FTDntXaO%2F6sKmckcDwSnSusQWtvVeLXSpYnOWKhqYv5bLWxdF%2FFtUTNYpQeICxJiSp8fneOixKf5%2BSQKh886AP0iMES2ipaOJf1vQJmsn55upQk2sc71mf8ORn%2F2i5iX28yLzaxRaRcMxi1GsStMRLYzH4CbGfltDXy8JrKc%2FuoccuLuoPWOOxml9xAWQRltvaCCB1UbfgWrRiRw%2FYjfJVvq%2B1b2%2FCIh6Y8nN1p5%2FC7SU%2Fn0rZTKH9T7Cp%2F%2FSobmF5TnUxxDc1buDTV%2BLOKkVX7CbvQ6PMTOkx0WZwxyR%2BDkfmpZMlSahPGwUdqpNiVeBtQnpfuE7Nq%2FrA%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2"; 
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get(url); 
		Thread.sleep(5000); 
		WebElement userid = webDriver.findElement(By.name("userid")); 
		userid.sendKeys("SCM_IMPL"); 
		WebElement password = webDriver.findElement(By.name("password")); 
		password.sendKeys("SCM_IMPL"); 
		WebElement signInButton = webDriver.findElement(By.xpath(".//*[@id='Login']/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/button"));
		signInButton.click(); // Click on search button
		Thread.sleep(5000); // wait for 5 seconds to see the results
		webDriver.quit(); // Close the firefox
	}

}
