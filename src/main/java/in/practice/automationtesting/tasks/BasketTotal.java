package in.practice.automationtesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static in.practice.automationtesting.userinterfaces.BasketTotalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BasketTotal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_CHECKOUT));
    }
    public static BasketTotal theBasketTotal(){
        return instrumented(BasketTotal.class);
    }
}
