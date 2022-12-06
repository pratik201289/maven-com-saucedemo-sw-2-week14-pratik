package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By usernameField = By.name("user-name");
    By PasswordField = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By successLoginMessage = By.xpath("//span[@class='title' and contains(text(),'Products')]");

    By getTotalSizeProducts = By.className("inventory_item");

    public void enterUserName(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(PasswordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSuccessLoginMesssage() {
        return getTextFromElement(successLoginMessage);
    }

    public int getTotalProductSize() {
        List<WebElement> list = driver.findElements(getTotalSizeProducts);
        int actualNumber = list.size();
        return actualNumber;
    }


}
