package co.com.choucair.certification.reto.tasks;


import co.com.choucair.certification.reto.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class FillOut implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguage;

    private String strCity;
    private String strZip;
    private String strCountry;

    private String strComputer;
    private String strVersion;
    private String strComputerLanguage;
    private String strMobile;
    private String strModel;
    private String strSystem;

    private String strPassword;
    private String strPasswordConfirm;

    public FillOut(String strName, String strLastName, String strEmail, String strMonth,
                   String strDay, String strYear, String strLanguage, String strCity,
                   String strZip, String strCountry, String strComputer, String strVersion,
                   String strComputerLanguage, String strMobile, String strModel, String strSystem,
                   String strPassword, String strPasswordConfirm) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguage = strLanguage;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strComputerLanguage = strComputerLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strSystem = strSystem;
        this.strPassword = strPassword;
        this.strPasswordConfirm = strPasswordConfirm;
    }

    public static FillOut the(String strName, String strLastName, String strEmail, String strMonth,
                              String strDay, String strYear, String strLanguage, String strCity,
                              String strZip, String strCountry, String strComputer, String strVersion,
                              String strComputerLanguage, String strMobile, String strModel, String strSystem,
                              String strPassword, String strPasswordConfirm) {

        return Tasks.instrumented(
                FillOut.class,strName,strLastName,strEmail,strMonth,strDay,strYear,strLanguage,
                strCity,strZip,strCountry,strComputer,strVersion,strComputerLanguage,strMobile,
                strModel,strSystem,strPassword,strPasswordConfirm);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //PRIMER PASO
                Enter.theValue(strName).into(FillOutFormPage.INPUT_NAME),
                Enter.theValue(strLastName).into(FillOutFormPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(FillOutFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(FillOutFormPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(FillOutFormPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(FillOutFormPage.SELECT_YEAR),
                Enter.theValue(strLanguage).into(FillOutFormPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_LANGUAGE),
                Click.on(FillOutFormPage.LOCATION_BUTTON),

                //SEGUNDO PASO
                Enter.theValue(strCity).into(FillOutFormPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(FillOutFormPage.DOWN_CITY),
                Hit.the(Keys.ENTER).into(FillOutFormPage.ENTER_CITY),
                Enter.theValue(strZip).into(FillOutFormPage.INPUT_ZIP),
                Click.on(FillOutFormPage.CLIC_COUNTRY),
                Enter.theValue(strCountry).into(FillOutFormPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_COUNTRY),
                Click.on(FillOutFormPage.DEVICE_BUTTON),

                //TERCER PASO
                Click.on(FillOutFormPage.CLIC_COMPUTER),
                Enter.theValue(strComputer).into(FillOutFormPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_COMPUTER),
                Click.on(FillOutFormPage.CLIC_VERSION),
                Enter.theValue(strVersion).into(FillOutFormPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_VERSION),
                Click.on(FillOutFormPage.CLIC_COM_LANGUAGE),
                Enter.theValue(strComputerLanguage).into(FillOutFormPage.INPUT_COM_LANGUAGE),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_COM_LANGUAGE),
                Click.on(FillOutFormPage.CLIC_MOBILE),
                Enter.theValue(strMobile).into(FillOutFormPage.INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_MOBILE),
                Click.on(FillOutFormPage.CLIC_MODEL),
                Enter.theValue(strModel).into(FillOutFormPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_MODEL),
                Click.on(FillOutFormPage.CLIC_SYSTEM),
                Enter.theValue(strSystem).into(FillOutFormPage.INPUT_SYSTEM),
                Hit.the(Keys.ENTER).into(FillOutFormPage.INPUT_SYSTEM),
                Click.on(FillOutFormPage.LAST_STEP_BUTTON),

                //ULTIMO PASO
                Enter.theValue(strPassword).into(FillOutFormPage.INPUT_PASSWORD),
                Enter.theValue(strPasswordConfirm).into(FillOutFormPage.INPUT_CONFIRM_PASSWORD),
                Click.on(FillOutFormPage.CLIC_TERMS),
                Click.on(FillOutFormPage.CLIC_PRIVACY),
                Click.on(FillOutFormPage.COMPLETE_BUTTON));

    }
}
