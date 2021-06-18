package in.practice.automationtesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.practice.automationtesting.models.DataBuyBook;
import in.practice.automationtesting.questions.QuestionBook;
import in.practice.automationtesting.questions.Validate;
import in.practice.automationtesting.tasks.BasketTotal;
import in.practice.automationtesting.tasks.BillingBuy;
import in.practice.automationtesting.tasks.BookAmount;
import in.practice.automationtesting.tasks.BookToBuy;
import in.practice.automationtesting.userinterfaces.BuyHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;

public class BuyStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor johan = Actor.named("Johan");

    @Before
    public void setUp() {
        johan.can(BrowseTheWeb.with(hisBrowser));
        johan.wasAbleTo(Open.browserOn(new BuyHomePage()));
    }

    @Given("^that I enter the page$")
    public void thatIEnterThePage() {
        johan.attemptsTo(BookToBuy.theBuy());
    }

    @When("^I select the book to buy and the desired quantity$")
    public void iSelectTheBookToBuyAndTheDesiredQuantity(List<DataBuyBook> dataBuyBookList) {
        johan.attemptsTo(BookAmount.theBookAmount(dataBuyBookList.get(0)));
        johan.should(seeThat(QuestionBook.theQuestionBook(dataBuyBookList.get(0))));
    }

    @Then("^I proceed to fill out the form to finish the purchase$")
    public void iProceedToFillOutTheFormToFinishThePurchase(List<DataBuyBook> dataBuyBookList) {
        johan.attemptsTo(BasketTotal.theBasketTotal());
        johan.attemptsTo(BillingBuy.theBillingBuy(dataBuyBookList.get(0)));
    }

    @And("^validate (.*)$")
    public void validatetheBanner(String vanner) {
        johan.should(seeThat(Validate.Banner(vanner)));
    }
}