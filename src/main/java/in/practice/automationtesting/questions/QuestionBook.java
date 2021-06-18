package in.practice.automationtesting.questions;

import in.practice.automationtesting.models.DataBuyBook;
import in.practice.automationtesting.userinterfaces.BasketTotalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Value;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class QuestionBook implements Question {

    private DataBuyBook dataBuyBook;
    public QuestionBook (DataBuyBook dataBuyBook){
        this.dataBuyBook=dataBuyBook;
    }

    public static Question<String> verifyBook(){
        return actor -> Value.of(BasketTotalPage.BOOK_AMOUNT).viewedBy(actor).asString();
    }
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(Ensure.that(BasketTotalPage.BOOK_NAME).text().isEqualTo(dataBuyBook.getBookName()));
        actor.should(seeThat(QuestionBook.verifyBook(),equalTo(dataBuyBook.getQuantity())));
        return true;
    }
    public static QuestionBook theQuestionBook(DataBuyBook dataBuyBook){
        return new QuestionBook(dataBuyBook);
    }
}
