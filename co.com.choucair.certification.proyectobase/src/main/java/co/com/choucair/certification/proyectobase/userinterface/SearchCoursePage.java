package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;

public class SearchCoursePage extends PageObject{

    public static fin Target BUTTON_UC =Target.the("select Universidad Chocair")
    .located(By.xpath("//div[@id='universidad']//strong"));

    public static fin Target INPUT_COURSE =Target.the("search the course")
            .located(By.id("coursesearchbox"));

    public static fin Target BUTTON_GO =Target.the("click to search the course")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static fin Target SELECT_COURSE =Target.the("click to search the course")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));




}
