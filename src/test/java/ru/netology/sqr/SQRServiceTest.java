package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrTest.csv")
    public void testSqrService(int expected, int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();
        int actual = service.sqrCounter(lowerLimit, upperLimit);
        Assertions.assertEquals(expected, actual);
    }
}
