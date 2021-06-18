package in.practice.automationtesting.questions;

import in.practice.automationtesting.userinterfaces.BuyAccept;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class Validate implements Question {

    String vanner;

    public Validate(String vanner) {
       this.vanner = vanner;
    }
    @Override
    public Object answeredBy(Actor actor) {
        System.out.println(BuyAccept.BANNER_ACCEPT.resolveFor(actor).getText());
        System.out.println(vanner);
        return BuyAccept.BANNER_ACCEPT.resolveFor(actor).getText().equals(vanner);
    }
    public static Validate Banner(String vanner){
        return new Validate(vanner);
    }
}
