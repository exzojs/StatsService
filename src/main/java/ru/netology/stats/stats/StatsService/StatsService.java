package ru.netology.stats.stats.StatsService;

public class StatsService {

    public int amountSales(long[] sales) {
        int summ = 0;
        for (int i = 0; i < sales.length; i++) {
            summ += sales[i];
        }
        return summ;
    }

    public int averageSalesAmount(long[] sales) {
        int summ = amountSales(sales);
        int average = summ / sales.length;
        return average;


    }

    public int findMaxSummPerMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSummPerMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int monthsWithBelowAverageSales(long[] sales) {
        int average = averageSalesAmount(sales);
        int minMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                minMonths = minMonths +1;
            }
        }
        return minMonths;
    }


    public int monthsWithAboveAverageSales(long[] sales) {
        int average = averageSalesAmount(sales);
        int maxMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                maxMonths = maxMonths +1;
            }
        }
        return maxMonths;

    }

}
