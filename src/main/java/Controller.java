import models.Student;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        ArrayList<Student> students = new ArrayList<Student>();

        Student cleyra = new Student ("Cleyra");
        Student tara = new Student("Tara");
        Student farji = new Student("Farji");
        Student adri = new Student("Adri");
        Student angelina = new Student("Angelina");
        Student farheen = new Student("Farheen");
        Student debi = new Student("Debi");
        Student harjit = new Student("Harjit");
        Student dereck = new Student("Dereck");
        Student jack = new Student("Jack");
        Student matt = new Student("Matt");
        Student joe = new Student("Joe");
        Student roddy = new Student("Roddy");
        Student pete = new Student("Pete");
        Student stephan = new Student("Stephan");
        Student stevie = new Student("Stevie");
        Student campbell = new Student("Campbell");
        Student richard = new Student("Richard");
        Student greg = new Student("Greg");
        Student craig = new Student("Craig");

        students.add(cleyra);
        students.add(tara);
        students.add(farji);
        students.add(adri);
        students.add(angelina);
        students.add(farheen);
        students.add(debi);
        students.add(harjit);
        students.add(dereck);
        students.add(jack);
        students.add(matt);
        students.add(joe);
        students.add(roddy);
        students.add(pete);
        students.add(stephan);
        students.add(stevie);
        students.add(campbell);
        students.add(richard);
        students.add(craig);
        students.add(greg);

        get("/one", (req, res) -> {
            Collections.shuffle(students);
            Student student = students.get(0);
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student);
            return new ModelAndView(model, "");
        }, velocityTemplateEngine);

//
//        get("/persons", (req, res) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            model.put("persons", persons);
//            model.put("template", "persons.vtl");
//            model.put("heading", "All Students");
//            return new ModelAndView(model, "layout.vtl");
//        }, velocityTemplateEngine);

    }
}
