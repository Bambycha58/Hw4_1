package ru.netology.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    public void shouldAskToAdd100() {
        int amount = 900;
        CashbackHacker service = new CashbackHacker();
        int expected = service.remain(amount);

        Assert.assertEquals(100, expected);

    }

    @Test
    public void shouldNotAskToAdd() {
        int amount = 1000;
        CashbackHacker service = new CashbackHacker();
        int expected = service.remain(amount);

        Assert.assertEquals(0, expected);

    }



}