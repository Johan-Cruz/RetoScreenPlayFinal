package in.practice.automationtesting.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import  static in.practice.automationtesting.userinterfaces.BookPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectAmount implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NUMBER_BOOK));

    }
    public static SelectAmount theSelectAmount (){
        return instrumented(SelectAmount.class);
    }
}
