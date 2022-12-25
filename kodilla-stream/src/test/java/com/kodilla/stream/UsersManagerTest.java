package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testReturnRightUsername() {

        // When
        List<String> results = UsersManager.filterChemistGroupUsernames();

        //Then
        assertEquals(2, results.size());
        assertTrue(results.contains("Walter White"));
        assertTrue(results.contains("Gale Boetticher"));
    }

    @Test
    public void testReturnUsersOlderThan() {
        // When
        List<User> results = UsersManager.getUsersOlderThan(40);

        //Then
        assertEquals(4,results.size());

        List<Integer> ages = results.stream()
                .map(User::getAge)
                .collect(Collectors.toList());

        assertTrue(ages.containsAll(List.of(50,57,44,49)));
    }

    @Test
    public void testReturnUsersYoungerThan() {
        // When
        List<User> results = UsersManager.getUsersYoungerThan(40);

        //Then
        assertEquals(2,results.size());

        List<Integer> ages = results.stream()
                .map(User::getAge)
                .collect(Collectors.toList());

        assertTrue(ages.containsAll(List.of(25,34)));
    }
}