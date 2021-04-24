package co.com.choucair.certification.reto.questions;

import co.com.choucair.certification.reto.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String strWelcome;

    public Answer(String strWelcome) {
        this.strWelcome = strWelcome;
    }

    public static Answer toThe(String strWelcome) {
        return new Answer(strWelcome);
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeUtest = Text.of(FillOutFormPage.WELCOME_UTEST).viewedBy(actor).asString();
        if (strWelcome.equals(welcomeUtest)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
