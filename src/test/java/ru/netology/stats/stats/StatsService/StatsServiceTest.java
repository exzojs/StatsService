package ru.netology.stats.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findSummSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;
        int actualSales = service.amountSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);


    }

    @Test
    public void findAverangeAmounSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumm = 15;
        int actualSumm = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedSumm, actualSumm);

    }

    @Test
    public void lookMaxSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSumm = 8;
        int actualMaxSumm = service.findMaxSummPerMonth(sales);

        Assertions.assertEquals(expectedMaxSumm, actualMaxSumm);


    }

    @Test
    public void lookMinSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSumm = 9;
        int actualMinSumm = service.findMinSummPerMonth(sales);

        Assertions.assertEquals(expectedMinSumm, actualMinSumm);
    }

    @Test
    public void findNumberOfMinMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.monthsWithBelowAverageSales(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);

    }

    @Test
    public void findNumberOfMaxMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.monthsWithAboveAverageSales(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);

    }
}
