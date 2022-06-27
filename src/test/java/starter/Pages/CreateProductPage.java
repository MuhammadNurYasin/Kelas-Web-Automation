package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/products/new")
public class CreateProductPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/h1")
    WebElement headerNewProductPage;

    @FindBy(id = "name")
    WebElement fieldProductName;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[3]/div[2]/input")
    WebElement fieldProductCode;

    @FindBy(xpath = "//*[@id=\"react-select-2--value\"]/div[2]/input")
    WebElement inputProductCategory;

    @FindBy(className = "Select-menu-outer")
    WebElement addProductCategory;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[6]/div[2]/textarea")
    WebElement fieldProductDescription;

    @FindBy(xpath = "//*[text()=\"Single\"]")
    WebElement productType;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]/h4/div")
    WebElement fieldbuyPrice;

    @FindBy(name = "priceProductBuy")
    WebElement inputBuyPrice;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/h4/div")
    WebElement fieldSalePrice;

    @FindBy(name = "priceProductSale")
    WebElement inputSalePrice;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/span[2]/span")
    WebElement dropdownBuyTax;

    @FindBy(className = "Select-menu-outer")
    WebElement inputBuyTax;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/span[2]/span")
    WebElement dropdownSellTax;

    @FindBy(className = "Select-menu-outer")
    WebElement inputSellTax;

    @FindBy(id = "track-panel")
    WebElement trackStockCheckbox;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/h4/div")
    WebElement fieldMinimumStock;

    @FindBy(name = "priceInventoryAccount")
    WebElement inputMinimumStock;


    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[9]/div/button[1]")
    WebElement createProductButton;

    public String getNewProductHeader(){
        return headerNewProductPage.getText();
    }

    public void fillProductName(String productName){
        fieldProductName.sendKeys(productName);
    }

    public void fillProductCode(String productCode){
        fieldProductCode.sendKeys(productCode);
    }

    public void fillProductCategory(String productCategory){
        inputProductCategory.sendKeys(productCategory);
        addProductCategory.click();
    }

    public void fillProductDescription(String productDescription){
        fieldProductDescription.sendKeys(productDescription);
    }

    public void chooseProductType(){
        productType.click();
    }

    public void fillBuyPrice(String buyPrice){
        fieldbuyPrice.click();
        inputBuyPrice.sendKeys(buyPrice);
    }

    public void fillSellPrice(String sellPrice){
        fieldSalePrice.click();
        inputSalePrice.sendKeys(sellPrice);
    }

    public void chooseDefaultBuyTax(){
        dropdownBuyTax.click();
        inputBuyTax.click();
    }

    public void chooseDefaultSellTax(){
        dropdownSellTax.click();
        inputSellTax.click();
    }

    public void clickTrackButton(){
        trackStockCheckbox.click();
    }

    public void fillMinimumStock(int minimumStock){
        fieldMinimumStock.click();
        inputMinimumStock.sendKeys(String.valueOf(minimumStock));
    }

    public void clickCreateProductButton(){
        createProductButton.click();
    }
}
