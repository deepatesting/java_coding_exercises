package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private LocalDateTime newDateTime;
    private LocalDateTime convertedDateTime;

    public Exercise004(LocalDate date) {
        convertedDateTime = date.atStartOfDay();
        this.newDateTime = convertedDateTime.plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        newDateTime = dateTime.plusSeconds(1000000000);
        this.newDateTime = newDateTime;
    }

    public LocalDateTime getDateTime() {
        return newDateTime;
    }
}
