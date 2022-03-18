package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private LocalDateTime newDateTime;
    private LocalDateTime convertedDateTime;

    public Exercise004(LocalDate date) {
        this.convertedDateTime = date.atStartOfDay();
        this.newDateTime = this.convertedDateTime.plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.newDateTime = dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return this.newDateTime;
    }
}
