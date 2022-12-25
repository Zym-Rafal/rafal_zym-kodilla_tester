package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Teacher teacherWojciech = new Teacher("Wojciech Nowicki");
        Teacher teacherBeata = new Teacher("Beata Tekla");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Nowak", teacherWojciech));
        students.add(new Student("Kamil Kowalski", null));
        students.add(new Student("Ania Mazur", teacherBeata));
        students.add(new Student("Aleksander Kujawiak", null));
        students.add(new Student("Weronika Zielona", teacherWojciech));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Uczen: " + student.getName() +
                    ", Nauczyciel: " + (optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>"));

        }
    }
}
