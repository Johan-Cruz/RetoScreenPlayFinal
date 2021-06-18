package in.practice.automationtesting.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://practice.automationtesting.in/shop/")
public class BuyHomePage extends PageObject {
    public static final Target BOOK_GUIDE = Target.the("Button Book1").located(By.xpath("//*[contains(text(),'Android Quick Start Guide')]"));
    public static final Target BOOK_PROGRAMMING = Target.the("Button Book2").located(By.xpath("//*[contains(text(),'Functional Programming in JS')]"));
    public static final Target BOOK_FORMS = Target.the("Button Book3").located(By.xpath("//*[contains(text(),'HTML5 Forms')]"));
    public static final Target BOOK_GROWTH = Target.the("Button Book4").located(By.xpath("//*[contains(text(),'HTML5 WebApp Develpment')]"));
}
