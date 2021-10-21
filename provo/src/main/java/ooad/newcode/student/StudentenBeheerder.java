package ooad.newcode.student;

import java.util.ArrayList;

public class StudentenBeheerder {
    private ArrayList<Student> studenten = new ArrayList<>();

    public void aanmeldenBijLokaal(String lokaal, String studentennaam) {
        var nieuweStudent = new Student(lokaal, studentennaam);
        studenten.add(nieuweStudent);
    }
}
