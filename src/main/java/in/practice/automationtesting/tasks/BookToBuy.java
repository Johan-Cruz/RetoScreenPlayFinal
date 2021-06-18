package in.practice.automationtesting.tasks;

import in.practice.automationtesting.interactions.SelectBook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BookToBuy implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SelectBook.theSelectBook());
    }
    public static BookToBuy theBuy(){

        return instrumented(BookToBuy.class);
    }
}
