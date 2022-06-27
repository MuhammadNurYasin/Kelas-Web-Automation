package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://my.jurnal.id/products/products_and_services")
public class ProductPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/div/div/h2")
    WebElement headerProductPage;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[1]/div/div[2]/i")
    WebElement actionDropdownButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[2]/div[1]/a/div")
    WebElement newProductButton;

    public String getHeaderPage(){
        return headerProductPage.getText();
    }

    public void clickActionButton(){
        actionDropdownButton.click();
    }

    public void clickNewProduct(){
        newProductButton.click();
    }
}
