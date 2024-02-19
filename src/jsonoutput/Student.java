package jsonoutput;

import java.util.Arrays;

public class Student {

    private final String firstName;
    private final String lastName;
    private final double gpa;
    private final PhoneNumber phoneNumber;
    private final String[] skills;

    public Student(String studentInfo) {
        String[] infoList = studentInfo.split(", ");
        this.firstName = infoList[1];
        this.lastName = infoList[0];
        this.gpa = Double.parseDouble(infoList[2]);
        this.phoneNumber = new PhoneNumber(infoList[3]);
        this.skills = infoList[4].split(";");
    }

    @Override
    public String toString() {
        return ("[firstName: " + firstName + ", lastName: " + lastName + ", gpa: " + gpa + ", phoneNumber: " + phoneNumber + ", skills: " + Arrays.toString(skills) + "]");
    }
}
