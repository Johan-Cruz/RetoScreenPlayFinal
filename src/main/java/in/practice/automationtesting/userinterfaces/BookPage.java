package in.practice.automationtesting.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookPage extends PageObject {

    public static final Target NUMBER_BOOK = Target.the("Amount Book Android").located(By.xpath("//div[@class='quantity']/input"));
    public static final Target BUTTON_ADD_BASKET = Target.the("Add Book Basket").located(By.xpath("//button[contains(text(),'Add to basket')]"));
    public static final Target BUTTON_BASKET = Target.the("Basket").located(By.className("wpmenucart-icon-shopping-cart-0"));
}
