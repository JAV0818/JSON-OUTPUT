package jsonoutput;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

public class JsonOutput {

    public static void main(String[] args) {

        String[] studentInfo = {"Juan, Don, 3.3, 888-555-1212, snoozing;dreaming",
            "Jones, Tom, 3.5, 866-555-1212, kayaking;surfing;hiking;",
            "Woodhouse, Emma, 3.9, 860-555-1212, Java;Python;Javascript"};

        List<Student> myStudentList = new ArrayList<>();

        for (String studentInfo1 : studentInfo) {
            myStudentList.add(new Student(studentInfo1));
        }

        //Gson object ready for pretty printing 
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();

        // convert the java studentList object to a json string
        String jsonString1 = gson1.toJson(myStudentList);

        //print json string 
        System.out.println(jsonString1);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String jsonString2 = gson2.toJson(myStudentList.toString());
        System.out.println(jsonString2);

        ArrayList<Student> persons = gson1.fromJson(jsonString1, new TypeToken<List<Student>>() {
        }.getType());

        for (Student st : persons) {
            System.out.println(st);

        }

    }

}
