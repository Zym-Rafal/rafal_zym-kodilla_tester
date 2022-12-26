package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static void main(String[] args) {
        System.out.println(averageNumberOfPostsForUsersAboveOrEqual40(UsersRepository.getUsersList()));
        System.out.println(averageNumberOfPostsForUsersBelow40(UsersRepository.getUsersList()));
    }

    public static double averageNumberOfPostsForUsersAboveOrEqual40(List<User> usersList) {
        return usersList
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double averageNumberOfPostsForUsersBelow40(List<User> userList) {
        return userList
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }
}
