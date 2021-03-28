package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import  co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Search;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    plublic void setStage() {
        OnStage.setTheStage(newOnlineCasts());
    }
    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonwantsTolearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData>academyChoucairData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.OnThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));


    }


        @When("^he search for the course on the choucair academy platform$")
        public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform (List<AcademyChoucairData> academyChoucairData)
        throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

        }

        @Then("^he finds the course called resources $")
        public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia (List<AcademyChoucairData> academyChoucairData)
                throws Exception{
        Ontage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

        }
    }

