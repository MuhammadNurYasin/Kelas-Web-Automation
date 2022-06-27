package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddContactStep;

public class AddContactStepDefinition {

    @Steps
    AddContactStep addContactStep;
    @When("I click contact menu")
    public void i_click_contact_menu(){
        addContactStep.clickContactMenu();
    }

    @Then("contact page appear")
    public void contact_page_appear() {
        addContactStep.verifyContactPage();
    }

    @When("I click new contact")
    public void i_click_new_contact() {
        addContactStep.clickContactMenu();
    }

    @Then("create new contact page appear")
    public void create_new_contact_page_appear() {
        addContactStep.clickNewContact();
    }

    @When("I fill name with {string}")
    public void i_fill_name_with(String name) {
        addContactStep.fillContactName(name);
    }

    @And("I choose contact type as customer")
    public void i_choose_contact_type_as_customer() {
        addContactStep.selectAsCustomer();
    }

    @And("I click add button")
    public void i_click_add_button() {
        addContactStep.clickAddButton();
    }

    @Then("contact with name {string} is created")
    public void contact_with_name_is_created(String name) {
        addContactStep.verifyContactCreated(name);
    }

    @And("I choose title for the name as Mr")
    public void i_choose_title_for_the_name_as_mr() {
        addContactStep.chooseTitleContactName();
    }

    @And("I fill first name with {string}")
    public void i_fill_first_name_with(String name) {
        addContactStep.fillFirstName(name);
    }

    @And("I fill middle name with {string}")
    public void i_fill_middle_name_with(String name) {
        addContactStep.fillMiddleName(name);
    }

    @And("I fill last name with {string}")
    public void i_fill_last_name_with(String name) {
        addContactStep.fillLastName(name);
    }

    @And("I fill phone number with {string}")
    public void i_fill_phone_number_with(String mobilePhone) {
        addContactStep.fillMobilePhone(mobilePhone);
    }

    @And("I choose identity with KTP")
    public void i_choose_identity_with_KTP() {
        addContactStep.chooseIdentityContactName();
    }

    @And("I fill identity number with {string}")
    public void i_fill_identity_number_with(String identityNumber) {
        addContactStep.fillIdentityNumber(identityNumber);
    }

    @And("I fill email name with {string}")
    public void i_fill_email_name_with(String emailName) {
        addContactStep.fillEmailName(emailName);
    }

    @And("I click dropdown button in List of Bank")
    public void i_click_dropdown_button_in_list_of_bank() {
        addContactStep.clickBankDropDown();
    }

    @And("I select bank name with BNI")
    public void i_select_bank_name_with() {
        addContactStep.chooseBankName();
    }

    @And("I fill bank branch with {string}")
    public void i_fill_bank_branch_with(String bankBranch) {
        addContactStep.fillBankBranch(bankBranch);
    }

    @And("I fill bank holder name with {string}")
    public void i_fill_bank_holder_name_with(String holderName) {
        addContactStep.fillBankHolderName(holderName);
    }

    @And("I fill account number with {string}")
    public void i_fill_account_number_with(String accountNumber) {
        addContactStep.fillAccountNumber(accountNumber);
    }

    /*@And("I click dropdown button in Account Mapping")
    public void i_click_dropdown_button_in_account_mapping() {
        
    }

    @And("I choose account receivable with {string}")
    public void i_choose_account_receivable_with(String arg0) {
        
    }

    @And("I choose account payable with {string}")
    public void i_choose_account_payable_with(String arg0) {
        
    }

    @And("I choose activate maximal receivable")
    public void i_choose_activate_maximal_receivable() {
        
    }

    @And("I fill max receivable with {int}")
    public void i_fill_max_receivable_with(int arg0) {
        
    }

    @And("I choose default payment terms with {string}")
    public void i_choose_default_payment_terms_with(String arg0) {

    }*/
}
