package application;

import java.util.ArrayList;
import java.util.List;

public class    Main {
    final static int CURRENT_YEAR = 2026;
    public static void main(String[] args) {

        final String GREETING_MESSAGE = "Saludo Estudiantes de Java"
                String [] namesStudents = {"Juan", "Maria", "Pedro", "Ana", "Luis"};
        int [] birthYears = {2000, 1998, 2002, 1995, 2001};
        List<int[]> agesStudentList = new ArrayList<>();
    }

    void showMessage(String message){
        System.out.println(message);
    }

    static int calculatedAge   (int birthYear) {
        return CURRENT_YEAR - birthYear;
    }

}
