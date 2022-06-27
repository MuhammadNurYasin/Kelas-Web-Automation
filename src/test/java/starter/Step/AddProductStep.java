package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.*;

import static org.junit.Assert.*;

public class AddProductStep {

    LoginJurnalPage loginJurnalPage;
    MenuPage menuPage;

    ProductPage productPage;

    CreateProductPage createProductPage;

    ProductDetail productDetail;


    @Step
    public void loginJurnalPage(){
        loginJurnalPage.open();
        loginJurnalPage.inputUserEmail();
        loginJurnalPage.inputPassword();
        loginJurnalPage.clickLoginButton();

    }
    @Step
    public void clickProductMenu(){
        menuPage.open();
        menuPage.clickProductMenu();
    }

    @Step
    public void verifyProductPage(){
        String headerPage = productPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("products"));
    }

    @Step
    public void clickActionMenu(){
        productPage.clickActionButton();
    }

    @Step
    public void clickNewProduct(){
        productPage.clickNewProduct();
    }

    @Step
    public void verifyNewProductPage(){
        String headerPage = createProductPage.getNewProductHeader();
        assertTrue(headerPage.equalsIgnoreCase("create new product / service"));
    }

    @Step
    public void fillProductName(String productName){
        createProductPage.fillProductName(productName);
    }

    @Step
    public void fillProductCode(String productCode){
        createProductPage.fillProductCode(productCode);
    }

    @Step
    public void fillProductCategory(String productCategory){
        createProductPage.fillProductCategory(productCategory);
    }

    @Step
    public void fillProductDescription(String productDescription){
        createProductPage.fillProductDescription(productDescription);
    }

    @Step
    public void chooseProductType(){
        createProductPage.chooseProductType();
    }

    @Step
    public void fillBuyPrice(String buyPrice){
        createProductPage.fillBuyPrice(buyPrice);
    }
    @Step
    public void chooseDefaultBuyTax(){
        createProductPage.chooseDefaultBuyTax();
    }

    @Step
    public void fillSellPrice(String sellPrice){
        createProductPage.fillSellPrice(sellPrice);
    }

    @Step
    public void chooseDefaultSellTax(){
        createProductPage.chooseDefaultSellTax();
    }

    @Step
    public void clickTrackButton(){
        createProductPage.clickTrackButton();
    }

    @Step
    public void fillMinimumStock(int minimumStock){
        createProductPage.fillMinimumStock(minimumStock);
    }

    @Step
    public void clickCreateProductButton(){
        createProductPage.clickCreateProductButton();
    }

    @Step
    public void verifyProductNameCreated(String expectedName){

        String actualName = productDetail.getProductName();
        assertTrue(expectedName.equalsIgnoreCase(actualName));
    }

    @Step
    public void verifyProductCodeCreated(String expectedCode){
        String actualCode = productDetail.getProductCode();
        assertTrue(expectedCode.equalsIgnoreCase(actualCode));
    }

    @Step
    public void verifyProductCategoryCreated(String expectedCategory){
        String actualCategory = productDetail.getProductCategory();
        assertTrue(expectedCategory.equalsIgnoreCase(actualCategory));
    }

    @Step
    public void verifyProductDescriptionCreated(String expectedDescription){
        String actualDescription = productDetail.getProductDescription();
        assertTrue(expectedDescription.equalsIgnoreCase(actualDescription));
    }

    @Step
    public void verifyProductBuyPriceCreated(String expectedBuyPrice){
        String actualBuyPrice = productDetail.getProductBuyPrice();
        assertTrue(expectedBuyPrice.equalsIgnoreCase(actualBuyPrice));
    }

    @Step
    public void verifyProductSellPriceCreated(String expectedSellPrice){
        String actualSellPrice = productDetail.getProductSellPrice();
        assertTrue(expectedSellPrice.equalsIgnoreCase(actualSellPrice));
    }

    @Step
    public void verifyProductMinimumStockCreated(String expectedMinimumStock){
        String actualMinimumStock = productDetail.getProductMinimumStock();
        assertTrue(expectedMinimumStock.equalsIgnoreCase(actualMinimumStock));
    }

}
