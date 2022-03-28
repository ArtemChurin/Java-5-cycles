package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    void shouldCalculateSqr() {
        SQRService service = new SQRService();
        int lowerRange = 200;
        int upperRange = 300;
        int expected = 3;

        int actual = service.calculateSqr(lowerRange, upperRange);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        SQRService service = new SQRService();
        int lowerRange = 99;
        int upperRange = 10000;
        int expected = 90;

        int actual = service.calculateSqr(lowerRange, upperRange);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        SQRService service = new SQRService();
        int lowerRange = 0;
        int upperRange = 99;
        int expected = 0;

        int actual = service.calculateSqr(lowerRange, upperRange);

        assertEquals(expected, actual);
    }
}