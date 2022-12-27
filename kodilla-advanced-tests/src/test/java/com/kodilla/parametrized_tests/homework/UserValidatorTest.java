package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource (strings = {"akdo","IOASBHCWIO","4987", "1dssRver", ".dr53_", ".....", ".--_.", "aZ01.-_"})
    public void shouldReturnTrueWhenUsernamesContainRightAndEnoughChars(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource (strings = {"akdo:","I: OA@SBHCWIO","49", "", ".d\n/3_", "..'..", "/.", "aZ0 1.-_"})
    public void shouldReturnFalseWhenUsernamesNotContainRightCharsOrNotEnough(String username) {
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource (strings = {"A_aQ2@aN28.dhiB","_.icuew23@chj.n", "2aQ-@ta.tuBBuu","1.1@1.a"})
    public void shouldReturnTrueWhenEmailsContainRightAndEnoughChars(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource (strings = {"A_aQ2@aN28.dhiB1",".icuew23@chj. ", "2aQ-.@ta.tuBBuuvervr","1.1@1.1", "/1389@wibvcuo .h"})
    public void shouldReturnFalseWhenEmailsNotContainRightCharsOrNotEnough(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }
}