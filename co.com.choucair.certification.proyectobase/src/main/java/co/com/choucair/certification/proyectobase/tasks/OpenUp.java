package co.com.choucair.certification.proyectobase.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Perfomable;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static Performable thePage(){
        return Tasks.instrumented(OpenUp.class);

    }
    @Override
    public<T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.brwserOn(choucairAcademyPage));

    }


}
