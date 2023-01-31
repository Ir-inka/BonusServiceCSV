package ru.netology.sqr.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class BonusServiceCSVTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculate(String limit, long amount, boolean registered, long expected) {
        BonusServiceCSV service = new BonusServiceCSV();

        long actual = service.calcCSV(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

}
