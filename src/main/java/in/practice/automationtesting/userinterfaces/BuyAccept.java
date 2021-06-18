package in.practice.automationtesting.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuyAccept extends PageObject {
    public static final Target BANNER_ACCEPT = Target.the("Banner Accept").located(By.xpath("//p[contains(text(),'Thank you. Your order has been received.')]"));
}
