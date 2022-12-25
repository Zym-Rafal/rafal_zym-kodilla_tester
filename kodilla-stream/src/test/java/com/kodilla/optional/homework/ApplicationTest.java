package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void testReturnStudentWhoHaveTeacher() {
        // Given
        Teacher teacher = new Teacher("Wojciech Nowicki");
        Student student = new Student("Adam Nowak", teacher);

        // When
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        // Then
        assertTrue(optionalTeacher.isPresent());
        assertEquals("Wojciech Nowicki", optionalTeacher.get().getName());
    }

    @Test
    public void testReturnStudentWhoDoNotHaveTeacher() {
        // Given
        Student student = new Student("Kamil Kowalski", null);

        // When
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        // Then
        assertTrue(optionalTeacher.isEmpty());
    }
}