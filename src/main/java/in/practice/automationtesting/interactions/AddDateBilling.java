package in.practice.automationtesting.interactions;

import in.practice.automationtesting.models.DataBuyBook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static in.practice.automationtesting.userinterfaces.BillingDetailsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddDateBilling implements Interaction {

    DataBuyBook dataBuyBook;

    public AddDateBilling(DataBuyBook dataBook){
        this.dataBuyBook=dataBook;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataBuyBook.getNameUser()).into(FIRST_NAME),
                Enter.theValue(dataBuyBook.getLastName()).into(LAST_NAME),
                Enter.theValue(dataBuyBook.getCompany()).into(COMPANY),
                Enter.theValue(dataBuyBook.getEmail()).into(EMAIL_USER),
                Enter.theValue(dataBuyBook.getTelephone()).into(TELEPHONE),
                Click.on(COUNTRY),
                Enter.theValue(dataBuyBook.getSearch_country()).into(COUNTRY_SEARCH),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(dataBuyBook.getAddress1()).into(ADDRESS_USER),
                Enter.theValue(dataBuyBook.getAddress2()).into(ADDRESS2_USER),
                Enter.theValue(dataBuyBook.getCity()).into(USER_CITY),
                Enter.theValue(dataBuyBook.getCounty_state()).into(COUNTY_STATE),
                Enter.theValue(dataBuyBook.getPostcode()).into(POSTCODE),
                Click.on(CHECK_ACCOUNT_CREATE),
                Enter.theValue(dataBuyBook.getPassword()).into(PASSWORD)
        );
        try{
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        actor.attemptsTo(
                Click.on(METHOD_PAYMENT),
                //WaitUntil
                Click.on(BUTTON_ORDER)
        );
    }
    public static AddDateBilling theAddDateBilling(DataBuyBook databook){
        return instrumented(AddDateBilling.class, databook);
    }
}
