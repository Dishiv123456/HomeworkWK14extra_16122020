package com.demo.orangehrmlive.pages;

import com.cucumber.listener.Reporter;
import com.demo.orangehrmlive.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());


    @FindBy(css = "a.panelTrigger")
    WebElement _welcomeText;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logOutBtn;

    //This method will get text to verify login successfully

    public String  getWelcomeText(){
        waitUntilElementToBeClickable(_welcomeText,30);
        Reporter.addStepLog("get text to verify "+_welcomeText.toString()+"<br>");
        log.info("get text to verify "+_welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }

    //This method will click on welcome admin link
    public void   clickOnWelcomeText(){
        waitUntilElementToBeClickable(_welcomeText,30);
        Reporter.addStepLog("clicking on welcome Admin link "+_welcomeText.toString()+"<br>");
        log.info("clicking on welcome Admin link"+_welcomeText.toString());
       clickOnElement(_welcomeText);
    }
    //This method will click on log out  btn
    public void clickOnLogOutBtn(){
        Reporter.addStepLog("clicking on log out btn "+_logOutBtn.toString()+"<br>");
        log.info("clicking on log out btn "+_logOutBtn.toString());
        clickOnElement(_logOutBtn);
    }

}
