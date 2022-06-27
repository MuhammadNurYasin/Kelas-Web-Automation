package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/contacts/new")
public class CreateContactPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/span[2]")
    WebElement headerNewContactPage;

    @FindBy(id = "display_name")
    WebElement fieldDisplayName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[1]/div/div/div[3]/div[2]/label[1]/span")
    WebElement chooseAsCustomer;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[2]/div[1]/div/div/span")
    WebElement selectTitleDropDown;

    @FindBy(xpath = "//*[@id=\"Mr.\"]")
    WebElement chooseMrForTitle;

    @FindBy(id = "first_name")
    WebElement fieldFirstName;

    @FindBy(id = "middle_name")
    WebElement fieldMiddleName;

    @FindBy(id = "last_name")
    WebElement fieldLastName;

    @FindBy(id = "mobile")
    WebElement fieldMobilePhone;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[4]/div[1]/div/div/span/span")
    WebElement selectIdentityDropDown;

    @FindBy(xpath = "//*[@id=\"react-select-4--value-item\"]")
    WebElement chooseKTPForIdentity;

    @FindBy(id = "identity_number")
    WebElement fieldIdentityNumber;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[5]/div[2]/label/ul/input")
    WebElement fieldEmailName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[3]/div/div/div/i")
    WebElement selectBankDropDown;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[3]/div/div/div[3]/div/div/div/span")
    WebElement selectBankNameDropDown;

    @FindBy(xpath = "//*[@id=\"react-select-7--value-item\"]")
    WebElement chooseBNIForBankName;

    @FindBy(xpath = "//*[@id=\"0\"]")
    WebElement fieldBankBranch;

    @FindBy(xpath = "//*[@id=\"0\"]")
    WebElement fieldBankHolderName;

    @FindBy(xpath = "//*[@id=\"0\"]")
    WebElement fieldAccountNumber;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[4]/div/div/div/i")
    WebElement selectAccountMappingDropDown;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[5]/div/button[1]")
    WebElement addButton;

    public String getNewContactHeader(){
        return headerNewContactPage.getText();
    }

    public void fillName(String name){
        fieldDisplayName.sendKeys(name);
    }

    public void chooseTypeasCustomer(){
        chooseAsCustomer.click();
    }


    public void setSelectTitleDropDown(){
        selectTitleDropDown.click();
    }
    public void chooseMrTitleForContactName(){
        chooseMrForTitle.click();
    }
    public void fillFirstName(String name){
        fieldFirstName.sendKeys(name);
    }

    public void fillMiddleName(String name){
        fieldMiddleName.sendKeys(name);
    }

    public void fillLastName(String name){
        fieldLastName.sendKeys(name);
    }

    public void fillMobilePhone(String mobilePhone){
        fieldMobilePhone.sendKeys(mobilePhone);
    }

    public void setSelectIdentityDropDown(){
        selectIdentityDropDown.click();
    }

    public void chooseKTPForIdentity(){
        chooseKTPForIdentity.click();
    }

    public void fillIdentityNumber(String identityNumber){
        fieldIdentityNumber.sendKeys(identityNumber);
    }

    public void fillEmailName(String emailName){
        fieldEmailName.sendKeys(emailName);
    }

    public void setSelectBankDropDown(){
        selectBankDropDown.click();
    }

    public void setSelectBankNameDropDown(){
        selectBankNameDropDown.click();
    }

    public void chooseBNIForBankName(){
        chooseBNIForBankName.getAttribute("BNI");
    }

    public void fillBankBranch(String bankBranch){
        fieldBankBranch.sendKeys(bankBranch);
    }

    public void fillBankHolderName(String holderName){
        fieldBankHolderName.sendKeys(holderName);
    }

    public void fillAccountNumber(String accountNumber){
        fieldAccountNumber.sendKeys(accountNumber);
    }

    public void setSelectAccountMappingDropDown(){
        selectAccountMappingDropDown.click();
    }









    public void clickAddButton(){
        addButton.click();
    }
}
