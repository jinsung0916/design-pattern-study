package com.example.designpattern.object.phone;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class DateTimeInterval {

    private LocalDateTime from;
    private LocalDateTime to;

    private DateTimeInterval(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public static DateTimeInterval of(LocalDateTime from, LocalDateTime to) {
        return new DateTimeInterval(from, to);
    }

    public Duration duration() {
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public List<DateTimeInterval> splitByDay() {
        List<DateTimeInterval> result = new ArrayList<>();
        addFirstDay(result);
        addMiddleDays(result);
        addLastDay(result);
        return result;
    }

    private void addFirstDay(List<DateTimeInterval> result) {
        result.add(DateTimeInterval.of(from, LocalDateTime.of(from.toLocalDate(), LocalTime.MAX)));
    }

    private void addMiddleDays(List<DateTimeInterval> result) {
        for (int i = 0; i < daysBetween(); i++) {
            LocalDate day = from.toLocalDate().plusDays(i + 1);
            result.add(DateTimeInterval.of(LocalDateTime.of(day, LocalTime.MIN), LocalDateTime.of(day, LocalTime.MAX)));
        }
    }

    private int daysBetween() {
        return Period.between(from.toLocalDate(), to.toLocalDate()).getDays();
    }

    private void addLastDay(List<DateTimeInterval> result) {
        result.add(DateTimeInterval.of(LocalDateTime.of(to.toLocalDate(), LocalTime.MIN), to));
    }

}
