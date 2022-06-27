package starter.Pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://account.mekari.com/users/sign_in")
public class LoginJurnalPage extends PageObject {

    @FindBy(id = "user_email")
    WebElementFacade fieldEmail;

    @FindBy(id = "user_password")
    WebElement fieldPassword;

    @FindBy(id = "new-signin-button")
    WebElement loginButton;


    public void inputUserEmail(){
        fieldEmail.waitUntilClickable();
        fieldEmail.sendKeys("muhnuryasin12@gmail.com");
    }

    public void inputPassword(){
        fieldPassword.sendKeys("Yasin123456");
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
