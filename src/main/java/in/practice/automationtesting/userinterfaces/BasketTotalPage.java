package in.practice.automationtesting.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BasketTotalPage extends PageObject {

    public static final Target BOOK_AMOUNT = Target.the("Total book amount Basket").located(By.xpath("//div[@class='quantity']/input"));
    public static final Target BOOK_NAME= Target.the("Prove the name book").located(By.xpath("//a[contains(text(), 'Android Quick Start Guide')]"));
    public static final Target BUTTON_CHECKOUT= Target.the("The button checkout").located(By.xpath("//a[contains(text(), 'Proceed to Checkout')]"));
}
