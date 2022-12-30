package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestDataSources {

    static Stream<Arguments> provideTestDataForTestingGetBMI() {
        return Stream.of(
                Arguments.of(45,1.8,"Very severely underweight"),
                Arguments.of(50,1.8,"Severely underweight"),
                Arguments.of(58,1.8,"Underweight"),
                Arguments.of(65,1.8,"Normal (healthy weight)"),
                Arguments.of(90,1.8,"Overweight"),
                Arguments.of(100,1.8,"Obese Class I (Moderately obese)"),
                Arguments.of(120,1.8,"Obese Class II (Severely obese)"),
                Arguments.of(135,1.8,"Obese Class III (Very severely obese)"),
                Arguments.of(150,1.8,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(165,1.8,"Obese Class V (Super Obese)"),
                Arguments.of(210,1.8,"Obese Class VI (Hyper Obese)")
        );
    }
}
