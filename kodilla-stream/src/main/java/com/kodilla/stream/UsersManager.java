package com.kodilla.stream;


import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User :: getUsername)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<User> getUsersOlderThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<User> getUsersYoungerThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < age)
                .collect(Collectors.toList());
    }
}
