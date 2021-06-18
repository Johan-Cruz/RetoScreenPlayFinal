package in.practice.automationtesting.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static in.practice.automationtesting.userinterfaces.BuyHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectBook implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOOK_GUIDE)
        );
    }
    public static SelectBook theSelectBook(){
        return instrumented(SelectBook.class);
    }
}
