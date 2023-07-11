package ru.netology.stats.HW_ARRAYS.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

 @Test

    public void shouldFindSumIfMonthUnprofitable() {
        StatsService service = new StatsService();

        int[] sales = {
                8, -15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedSum = 150;
        int actualSum = service.getSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }


    @Test

    public void shouldFindAverageIfSumBelowZero() {
        StatsService service = new StatsService();

        int[] sales = {
                -8, -15, -13, -15, -17, -20, -19, -20, -7, -14, -14, -18
        };

        int expectedAverage = -15;
        int actualAverage = service.getAverageSum(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test

    public void shouldFindMaxSalesMonthIfItFirst() {
        StatsService service = new StatsService();
        int[] sales = {
                28, -15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMaxMonth = 1;
        int actualMaxMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test

    public void shouldFindMinSalesMonthIfItLast() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 7
        };

        int expectedMinMonth = 12;
        int actualMinMonth = service.getMinSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void shouldFindQuantityLowerAverageMonthIfItAllUnprofitable() {
        StatsService service = new StatsService();
        int[] sales = {
                -8, -15, -13, -15, -17, -20, -19, -20, -7, -14, -14, -18
        };

        int expectedMinMonth = 5;
        int actualMinMonth = service.getMonthsLowerAverage(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void shouldFindQuantityLargerAverageMonthIfAllUnprofitable() {
        StatsService service = new StatsService();
        int[] sales = {
                -8, -15, -13, -15, -17, -20, -19, -20, -7, -14, -14, -18
        };

        int expectedQuantityLargerMonth = 7;
        int actualQuantityLargerMonth = service.getMonthsLargerAverage(sales);

        Assertions.assertEquals(expectedQuantityLargerMonth, actualQuantityLargerMonth);
    }

}
