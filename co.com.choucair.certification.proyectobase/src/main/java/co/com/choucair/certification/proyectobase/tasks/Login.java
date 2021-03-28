package co.com.choucair.certification.proyectobase.tasks;



import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Login implements Task{
    public Login(String strUser) {
        this.strUser = strUser;
    }

    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword){
        this.strUser = strUser;
        this.strPassword = strPassword;

    }
    public static Login OnThePage(String strUser, String strPassword) {
        return Task.instrumented(Login.class,strUser, strPassword);
    }

    @Override
    public <T extends Actor> void perfomAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
        Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
        Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );





    }
}
