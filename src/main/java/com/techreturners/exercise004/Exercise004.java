package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private final int GIGASECONDS = 1000000000;
    private LocalDateTime newDateTime;
    private LocalDateTime convertedDateTime;

    public Exercise004(LocalDate date) {
        this.convertedDateTime = date.atStartOfDay();
        this.newDateTime = this.convertedDateTime.plusSeconds(GIGASECONDS);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.newDateTime = dateTime.plusSeconds(GIGASECONDS);
    }

    public LocalDateTime getDateTime() {
        return this.newDateTime;
    }
}
