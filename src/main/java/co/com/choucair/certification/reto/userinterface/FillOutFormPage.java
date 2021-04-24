package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutFormPage {

    //PRIMER PASO
    public static final Target INPUT_NAME = Target.the("where do we write the name").
            located(By.id("firstName"));


    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name").
            located(By.id("lastName"));


    public static final Target INPUT_EMAIL = Target.the("where do we write the email").
            located(By.id("email"));


    public static final Target SELECT_MONTH = Target.the("where do we select the month").
            located(By.id("birthMonth"));


    public static final Target SELECT_DAY = Target.the("where do we select the day").
            located(By.id("birthDay"));


    public static final Target SELECT_YEAR = Target.the("where do we select the year").
            located(By.id("birthYear"));


    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language").
            located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));


    public static final Target LOCATION_BUTTON = Target.the("button to go to next step").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    //SEGUNDO PASO
    public static final Target INPUT_CITY = Target.the("where do we write the city").
            located(By.id("city"));
    public static final Target DOWN_CITY = Target.the("arrow down that select the city").
            located(By.id("city"));
    public static final Target ENTER_CITY = Target.the("enter that select the city").
            located(By.id("city"));


    public static final Target INPUT_ZIP = Target.the("where do we write the zip").
            located(By.id("zip"));


    public static final Target CLIC_COUNTRY = Target.the("clic to select country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));


    public static final Target DEVICE_BUTTON = Target.the("button to go to next step").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

    //TERCER PASO
    public static final Target CLIC_COMPUTER = Target.the("clic to select computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_COMPUTER = Target.the("where do we write the computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));


    public static final Target CLIC_VERSION = Target.the("clic to select version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_VERSION = Target.the("where do we write the version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));


    public static final Target CLIC_COM_LANGUAGE = Target.the("clic to select computer language").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_COM_LANGUAGE = Target.the("where do we write the computer language").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target CLIC_MOBILE = Target.the("clic to select mobile").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_MOBILE = Target.the("where do we write the mobile").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));


    public static final Target CLIC_MODEL = Target.the("clic to select model").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_MODEL = Target.the("where do we write the model").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));


    public static final Target CLIC_SYSTEM = Target.the("clic to select system").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_SYSTEM = Target.the("where do we write the system").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target LAST_STEP_BUTTON = Target.the("button to go to last step").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));


    //ULTIMO PASO
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").
            located(By.id("password"));


    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the password again").
            located(By.id("confirmPassword"));


    public static final Target CLIC_TERMS = Target.the("button to accept the utest terms of use").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));


    public static final Target CLIC_PRIVACY = Target.the("button to accept the privacy and security policy").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


    public static final Target COMPLETE_BUTTON = Target.the("button to finish the registration form").
            located(By.id("laddaBtn"));


    //verification
    public static final Target WELCOME_UTEST = Target.the("give us the Utest community welcome").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));



}
