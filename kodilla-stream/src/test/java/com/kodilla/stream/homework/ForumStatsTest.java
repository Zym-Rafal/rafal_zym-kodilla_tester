package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    private static List<User> users = new ArrayList<>();

    @BeforeAll
    public static void setup() {
        users.add(new User("Walter White", 39, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 40, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 41, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
    }

    @Test
    public void testReturnAverageNumberOfPostsForUsersAboveOrEqual40() {
        // When
        double result = ForumStats.averageNumberOfPostsForUsersAboveOrEqual40(users);

        // Then
        assertEquals(1162.5, result);
    }

    @Test
    public void testAverageNumberOfPostsForUsersBelow40() {
        // When
        double result = ForumStats.averageNumberOfPostsForUsersBelow40(users);

        //Then
        assertEquals(61.5, result);
    }
}