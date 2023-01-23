package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Scope("prototype")
public class Clock {

    private LocalDateTime time;

    public Clock() {
        this.time = LocalDateTime.now();
    }

    public LocalDateTime getTime() {
        return time;
    }
}