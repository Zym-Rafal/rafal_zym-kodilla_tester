package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineWithRightNumbersTestData.csv", delimiter = ';', numLinesToSkip = 1)
    public void shouldPassIfNumbersAreRight(String usersNumber) throws InvalidNumbersException {
        Set<Integer> numbers = arrayToSet(usersNumber);
        int result = machine.howManyWins(numbers);
        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineWithWrongNumbersTestData.csv", delimiter = ';', numLinesToSkip = 1)
    public void shouldFailTIfNumbersAreWrong(String usersNumber) throws InvalidNumbersException {
        Set<Integer> numbers = arrayToSet(usersNumber);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers));
    }

    private Set<Integer> arrayToSet(String numbersAsString) {
        String[] arrayOfStrings = numbersAsString.split(",");
        return new HashSet<>(Arrays.asList(arrayOfStrings)).stream()
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
    }
}