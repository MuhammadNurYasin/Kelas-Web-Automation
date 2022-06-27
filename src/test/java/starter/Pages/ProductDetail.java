package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetail extends PageObject {


    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[1]/div/div[1]")
    WebElement productName;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[1]/div/div[2]")
    WebElement productCode;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[6]/div[2]")
    WebElement productCategory;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[7]/div[2]")
    WebElement productDescription;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[3]/span")
    WebElement productBuyPrice;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/span")
    WebElement productSellPrice;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[5]/div[2]")
    WebElement productMinimumStock;

    public String getProductName(){
        return productName.getText();
    }

    public String getProductCode(){
        return productCode.getText();
    }

    public String getProductCategory(){
        return productCategory.getText();
    }

    public String getProductDescription(){
        return productDescription.getText();
    }

    public String getProductBuyPrice(){
        return productBuyPrice.getText();
    }

    public String getProductSellPrice(){
        return productSellPrice.getText();
    }

    public String getProductMinimumStock(){
        return productMinimumStock.getText();
    }

}
