package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'range 1-300',1,300, 17", "'range 9200-9801',9200,9801,4", "'range 1-9801',1,9801,99"})
    void calculate(String range, int leftBorder, int rightBorder, int expected) {

        SQRService service = new SQRService();

        int actual = service.calculate(leftBorder, rightBorder);

        assertEquals(expected, actual);

    }
}