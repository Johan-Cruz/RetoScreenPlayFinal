package in.practice.automationtesting.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BillingDetailsPage extends PageObject {

    public static final Target FIRST_NAME = Target.the("Input first name").located(By.id("billing_first_name"));
    public static final Target LAST_NAME = Target.the("Input last name").located(By.id("billing_last_name"));
    public static final Target COMPANY = Target.the("Input company").located(By.id("billing_company"));
    public static final Target EMAIL_USER = Target.the("Input email").located(By.id("billing_email"));
    public static final Target TELEPHONE = Target.the("Input telephone").located(By.id("billing_phone"));
    public static final Target COUNTRY = Target.the("Select country").located(By.className("select2-arrow"));
    public static final Target COUNTRY_SEARCH = Target.the("search country").located(By.id("s2id_autogen1_search"));
    public static final Target SELECT_COUNTRY = Target.the("Select country search").located(By.className("select2-match"));
    public static final Target ADDRESS_USER = Target.the("Input address user").located(By.id("billing_address_1"));
    public static final Target ADDRESS2_USER = Target.the("Input address2 user").located(By.id("billing_address_2"));
    public static final Target USER_CITY = Target.the("Input city").located(By.id("billing_city"));
    public static final Target COUNTY_STATE = Target.the("Input county staty").located(By.id("billing_state"));
    public static final Target POSTCODE = Target.the("Input postcode name").located(By.id("billing_postcode"));
    public static final Target CHECK_ACCOUNT_CREATE = Target.the("Create account").located(By.id("createaccount"));
    public static final Target PASSWORD = Target.the("Input password account").located(By.id("account_password"));
    public static final Target METHOD_PAYMENT = Target.the("Check method payment").located(By.xpath("//label[contains(text(), 'Direct Bank Transfer')]"));
    public static final Target BUTTON_ORDER = Target.the("Button continue order").located(By.xpath("//input[@id='place_order']"));
}
