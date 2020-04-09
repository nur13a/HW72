package com;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void checkedEvenIndices() {
        int[] array = App.getArray();
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                result = false;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    public void checkedOddIndices() {
        int[] array = App.getArray();
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0 && array[i] % 2 == 0) {
                result = false;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    public void checkOrder() {
        int[] array = App.getArray();
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                result = false;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    public void checkSum() {
        int y = 10;
        int[] array = App.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        assertTrue(sum < y);
    }

    @Test
    public void checkTriangleArea() {
        int h = 5;
        int a = 10;
        double result = App.getSquareOfTriangle(a, h);
        assertEquals(25, result, 0.01);
    }

    @Test
    public void checkIsPrime() {
        boolean result = App.getSimpleNum(5);
        assertTrue(result);
    }


    //HW72
    @Test
    public void checkEqualsCount() {
        List<List<Integer>> ATM = App.create();
        App.full(ATM, 5);
        String s = App.checking(ATM);
        assertEquals("мало купюр, надо пополнить", s);
    }

    @Test
    public void checkCountBanknotes() {
        List<List<Integer>> ATM = App.create();
        boolean result = true;
        if (ATM.size() < 4) result = false;
        assertTrue(result);
    }
//этот тест кажется работает неправильно. У меня с алгоритмами оказывается вообще никак.
// Можете посоветовать сайт для улучшения навыков?
    @Test
    public void checkTwiceMore() {
        List<List<Integer>> ATM = App.create();
        boolean b = false;
        App.full(ATM, 5);
        for (int i = 1; i < ATM.size(); i++) {
            if (ATM.get(i - 1).size() <=( ATM.get(i).size() * 2)) {
                b = true;
            }
        }
        assertTrue(b);
    }
}





