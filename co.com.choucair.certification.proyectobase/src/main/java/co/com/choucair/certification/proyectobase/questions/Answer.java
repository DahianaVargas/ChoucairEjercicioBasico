package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.tasks.Search;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.question.Text;

public class Answer implements Question <Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }
    @Override

        public Boolean answeredBy (Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedby(actor).asString();
        if (question.equals(nameCourse)) {
            result = true;

        } else {
            result = false;
        }
        return result;
    }

    }
}
