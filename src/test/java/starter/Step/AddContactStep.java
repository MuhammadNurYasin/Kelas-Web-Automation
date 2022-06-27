package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.ContactDetail;
import starter.Pages.ContactPage;
import starter.Pages.CreateContactPage;
import starter.Pages.MenuPage;
import static org.junit.Assert.*;

public class AddContactStep {
    MenuPage menuPage;
    ContactPage contactPage;
    CreateContactPage createContactPage;
    ContactDetail contactDetail;

    @Step
    public void clickContactMenu(){
        menuPage.open();
        menuPage.clickContactMenu();
    }

    @Step
    public void verifyContactPage(){
        String headerPage = contactPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("contacts"));
    }

    @Step
    public void clickNewContact(){
        contactPage.clickNewContact();
    }

    @Step
    public void createNewContact(){
        String headerPage = createContactPage.getNewContactHeader();
        assertTrue(headerPage.equalsIgnoreCase("create new contact"));
    }

    @Step
    public void fillContactName(String name){
        createContactPage.fillName(name);
    }

    @Step
    public void selectAsCustomer(){
        createContactPage.chooseTypeasCustomer();
    }

    @Step
    public void chooseTitleContactName(){
        createContactPage.setSelectTitleDropDown();
        createContactPage.chooseMrTitleForContactName();
    }

    @Step
    public void fillFirstName(String name){
        createContactPage.fillFirstName(name);
    }

    @Step
    public void fillMiddleName(String name){
        createContactPage.fillMiddleName(name);
    }

    @Step
    public void fillLastName(String name){
        createContactPage.fillLastName(name);
    }

    @Step
    public void fillMobilePhone(String mobilePhone){
        createContactPage.fillMobilePhone(mobilePhone);
    }

    @Step
    public void chooseIdentityContactName(){
        createContactPage.setSelectIdentityDropDown();
        createContactPage.chooseKTPForIdentity();
    }

    @Step
    public void fillIdentityNumber(String identityNumber){
        createContactPage.fillIdentityNumber(identityNumber);
    }

    @Step
    public void fillEmailName(String emailName){
        createContactPage.fillEmailName(emailName);
    }

    @Step
    public void clickBankDropDown(){
        createContactPage.setSelectBankDropDown();
    }

    @Step
    public void chooseBankName(){
        createContactPage.setSelectBankNameDropDown();
        createContactPage.chooseBNIForBankName();
    }
    @Step
    public void fillBankBranch(String bankBranch){
        createContactPage.fillBankBranch(bankBranch);
    }

    @Step
    public void fillBankHolderName(String holderName){
        createContactPage.fillBankHolderName(holderName);
    }

    @Step
    public void fillAccountNumber(String accountNumber){
        createContactPage.fillAccountNumber(accountNumber);
    }

    @Step
    public void selectAccountMappingDropDown(){
        createContactPage.setSelectAccountMappingDropDown();
    }


    @Step
    public void clickAddButton(){
        createContactPage.clickAddButton();
    }

    @Step
    public void verifyContactCreated(String ExpectedName){
        String actualName = contactDetail.getContactName();
        assertTrue(ExpectedName.equalsIgnoreCase(actualName));
        String type = contactDetail.getCustomerType();
        assertTrue(type.equalsIgnoreCase("customer"));
    }

}
