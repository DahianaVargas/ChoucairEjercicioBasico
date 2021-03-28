package co.com.choucair.certification.proyectobase.userinterface;

//import net.serenitybdd.core.pages.pageObject;
//import net.serenitybdd.screenplay.targets.Target;

import java.lang.annotation.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON =target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-leg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER =target.the("where do we write the user")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD =target.the("where do we write the password")
            .located(By.xpath("password"));

    public static final Target ENTER_BUTTON =target.the("button to confirm login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));



}
