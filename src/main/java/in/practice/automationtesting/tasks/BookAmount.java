package in.practice.automationtesting.tasks;

import in.practice.automationtesting.interactions.SelectAmount;
import in.practice.automationtesting.models.DataBuyBook;
import in.practice.automationtesting.userinterfaces.BookPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static in.practice.automationtesting.userinterfaces.BookPage.*;

public class BookAmount implements Task {

    DataBuyBook dataBuyBook;
    public BookAmount(DataBuyBook dataBuyBook){
        this.dataBuyBook = dataBuyBook;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("2").into(NUMBER_BOOK)
        );
        actor.attemptsTo(
                SelectAmount.theSelectAmount(),
                Click.on(BUTTON_ADD_BASKET),
                Click.on(BUTTON_BASKET)
        );


    }
    public static BookAmount theBookAmount(DataBuyBook dataBuyBook){
        return instrumented(BookAmount.class,dataBuyBook );
    }
}
