package in.practice.automationtesting.tasks;

import in.practice.automationtesting.interactions.AddDateBilling;
import in.practice.automationtesting.models.DataBuyBook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BillingBuy implements Task {

    DataBuyBook dataBuyBook;
    public BillingBuy(DataBuyBook dataBuyBook){
        this.dataBuyBook=dataBuyBook;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AddDateBilling.theAddDateBilling(dataBuyBook));
    }
    public static BillingBuy theBillingBuy(DataBuyBook dataBuyBook){
        return instrumented(BillingBuy.class,dataBuyBook);
    }
}
