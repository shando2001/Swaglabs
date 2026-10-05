package pages.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage.BasePage;

public class LoginPage extends BasePage {

    private Logger log= LogManager.getLogger(LoginPage.class);

    private final By userNameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By loginErrorMsg = By.xpath("//h3");
    private final By checkOutTitle = By.xpath("//span[@data-test='title']");



    public LoginPage(WebDriver driver){
        super(driver);
    }


    public WebElement getUserNameField(){
        log.info("getting username");
        return findElement(userNameField);
    }
    public WebElement getPasswordField(){
        log.info("getting password");
        return findElement(passwordField);
    }
    public WebElement getLoginButton(){
        log.info("getting login button");
        return findElement(loginButton);
    }
    public WebElement getLoginErrorMsg(){
        log.info("getting get login error msg");
        return findElement(loginErrorMsg);
    }
    public WebElement getCheckoutTitle(){return findElement(checkOutTitle);}

    public void enterUserName(String userName){
        log.debug("enter user name: {}", userName);

        getUserNameField().sendKeys(userName);


    }
    public void enterPassword(String password){
        log.debug("enter password: {}",password);
        getPasswordField().sendKeys(password);
    }
    public void clickLoginButton(){
        log.info("get clicking login button");
        getLoginButton().click();
    }
    public String getLoginErrorMsgString(){
        log.info("get login error msg: {}",getLoginErrorMsg().getText());
        return getLoginErrorMsg().getText();
    }


}
