package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateSumEqual1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateSumMoreThan1000() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateSumLessThan1000() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
