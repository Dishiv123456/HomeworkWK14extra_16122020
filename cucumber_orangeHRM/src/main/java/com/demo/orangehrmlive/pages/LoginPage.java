package com.demo.orangehrmlive.pages;

import com.cucumber.listener.Reporter;
import com.demo.orangehrmlive.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath ="//input[@id='txtUsername']")
    WebElement _userNameField;
    @FindBy(xpath ="//input[@id='txtPassword']" )
    WebElement _passwordField;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement _loginBtn;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _loginPanel;

    //This method will enter user name
    public void enterUserName(String email){
        Reporter.addStepLog("enter user name to user name  field "+_userNameField.toString()+"<br>");
        log.info("enter user name to user name  field"+_userNameField.toString());
        sendTextToElement(_userNameField,email);
    }
    //This method will enter password
    public void enterPassword(String password){
        Reporter.addStepLog("enter password to password field "+_passwordField.toString()+"<br>");
        log.info("enter password to password field "+_passwordField.toString());
        sendTextToElement(_passwordField,password);
    }
    //This method will click on login btn
    public void clickOnLoginBtn(){
        Reporter.addStepLog("clicking on login btn "+_loginBtn.toString()+"<br>");
        log.info("clicking on login btn "+_loginBtn.toString());
        clickOnElement(_loginBtn);
    }

    //This method will get text from login panel
    public String getTextToVerifyLogOutSuccessfully(){
        Reporter.addStepLog("get text to verify log out successfully "+_loginPanel.toString()+"<br>");
        log.info("get text to verify log out successfully "+_loginPanel.toString());
        return getTextFromElement(_loginPanel);


    }

}
