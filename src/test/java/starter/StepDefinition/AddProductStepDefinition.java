package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddProductStep;

public class AddProductStepDefinition {
    
    @Steps
    AddProductStep addProductStep;

    @Given("I already logged in")
    public void i_already_logged_in(){
        addProductStep.loginJurnalPage();
    }
    
    @When("I click product menu")
    public void i_click_product_menu(){
        addProductStep.clickProductMenu();
    }


    @Then("product page appear")
    public void product_page_appear() {
        addProductStep.verifyProductPage();
    }

    @When("I click action menu")
    public void i_click_action_menu() {
        addProductStep.clickActionMenu();
    }

    @And("I choose new product")
    public void i_choose_new_product() {
        addProductStep.clickNewProduct();
    }

    @Then("create new product page appear")
    public void create_new_product_page_appear() {
        addProductStep.verifyNewProductPage();
    }

    @When("I fill product name with {string}")
    public void i_fill_product_name_with(String productName) {
        addProductStep.fillProductName(productName);
    }

    @And("I fill product code with {string}")
    public void i_fill_product_code_with(String productCode) {
        addProductStep.fillProductCode(productCode);
    }

    @And("I fill product category with {string}")
    public void i_fill_product_category_with(String productCategory){
        addProductStep.fillProductCategory(productCategory);
    }

    @And("I fill product description with {string}")
    public void i_fill_product_description_with(String productDescription) {
        addProductStep.fillProductDescription(productDescription);
    }

    @And("I choose product type as Single")
    public void i_choose_product_type_as_single() {
        addProductStep.chooseProductType();
    }

    @And("I fill buy unit price with {string}")
    public void i_fill_buy_unit_price_with(String buyPrice) {
        addProductStep.fillBuyPrice(buyPrice);
    }

    @And("I choose default buy tax as PPN")
    public void i_choose_default_buy_tax_as_ppn() {
        addProductStep.chooseDefaultBuyTax();
    }

    @And("I fill sale unit price with {string}")
    public void i_fill_sale_unit_price_with(String sellPrice) {
        addProductStep.fillSellPrice(sellPrice);
    }

    @And("I choose default sell tax as PPN")
    public void i_choose_default_sell_tax_as_ppn() {
        addProductStep.chooseDefaultSellTax();
    }

    @And("I activate track stock button")
    public void i_activate_track_stock_button() {
        addProductStep.clickTrackButton();
    }

    @And("I fill minimum stock quantity with {int}")
    public void i_fill_minimum_stock_quantity_with(int minimumStock) {
        addProductStep.fillMinimumStock(minimumStock);
    }

    @And("I click create product button")
    public void i_click_create_product_button() {
        addProductStep.clickCreateProductButton();
    }

    @Then("product with name {string} is created")
    public void product_with_name_is_created(String expectedName) {
        addProductStep.verifyProductNameCreated(expectedName);
    }

    @And("product with code {string} is created")
    public void product_with_code_is_created(String expectedCode) {
        addProductStep.verifyProductCodeCreated(expectedCode);
    }


    @And("product with category {string} is created")
    public void product_with_category_is_created(String expectedCategory) {
        addProductStep.verifyProductCategoryCreated(expectedCategory);
    }

    @And("product with description {string} is created")
    public void product_with_description_is_created(String expectedDescription) {
        addProductStep.verifyProductDescriptionCreated(expectedDescription);
    }

    @And("product with buy price {string} is created")
    public void product_with_buy_price_is_created(String expectedBuyPrice) {
        addProductStep.verifyProductBuyPriceCreated(expectedBuyPrice);

    }

    @And("product with sell price {string} is created")
    public void product_with_sell_price_is_created(String expectedSellPrice) {
        addProductStep.verifyProductSellPriceCreated(expectedSellPrice);

    }

    @And("product with minimum stock {string} is created")
    public void product_with_minimum_stock_is_created(String expectedMinimumStock) {
        addProductStep.verifyProductMinimumStockCreated(expectedMinimumStock);
    }
}
