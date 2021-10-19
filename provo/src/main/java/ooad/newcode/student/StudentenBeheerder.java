package ooad.newcode.student;

import ooad.newcode.student.Student;

import java.util.ArrayList;

public class StudentenBeheerder {
    private ArrayList<Student> studenten = new ArrayList<>();

    public void inloggen(String lokaal, String studentennaam) {
        var nieuweStudent = new Student(lokaal, studentennaam);
        studenten.add(nieuweStudent);
    }
}
