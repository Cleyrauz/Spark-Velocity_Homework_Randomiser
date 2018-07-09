import models.Student;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

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



        get("/random", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("template", "random.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/one", (req, res) -> {
            Collections.shuffle(students);
            Student student = students.get(0);
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student);
            model.put("template", "randomName.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/two", (req, res) ->{
            Collections.shuffle(students);
            Student student1 = students.get(0);
            Student student2 = students.get(1);
            ArrayList<Student> twoStudents = new ArrayList<>();
            twoStudents.add(student1);
            twoStudents.add(student2);
            HashMap<String, Object> model = new HashMap<>();
            model.put("twoStudents", twoStudents);
            model.put("template", "twoRandomNames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/three", (seq, res) ->{
            Collections.shuffle(students);
            Student student1 = students.get(0);
            Student student2 = students.get(1);
            Student student3 = students.get(3);
            ArrayList<Student> threeStudents = new ArrayList<>();
            threeStudents.add(student1);
            threeStudents.add(student2);
            threeStudents.add(student3);
            HashMap<String, Object> model = new HashMap<>();
            model.put("threeStudents", threeStudents);
            model.put("template", "threeRandomNames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/four", (seq, res) ->{
            Collections.shuffle(students);
            Student student1 = students.get(0);
            Student student2 = students.get(1);
            Student student3 = students.get(3);
            Student student4 = students.get(4);
            ArrayList<Student> fourStudents = new ArrayList<>();
            fourStudents.add(student1);
            fourStudents.add(student2);
            fourStudents.add(student3);
            fourStudents.add(student4);
            HashMap<String, Object> model = new HashMap<>();
            model.put("fourStudents", fourStudents);
            model.put("template", "fourRandomNames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

    }
}
