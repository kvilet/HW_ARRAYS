package ru.netology.stats.HW_ARRAYS.service;

public class StatsService {

    public int getSumSales(int[] sales) {

        int sum = 0;
        for (int t : sales) {
            sum = sum + t;
        }
        return sum;
    }

    public int getAverageSum(int[] sales) {
        int average = getSumSales(sales) / sales.length;
        return average;
    }

    public int getMaxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }


    public int getMinSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int getMonthsLowerAverage(int[] sales) {
        int quantityLowerMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSum(sales)) {
                quantityLowerMonth++;
            }
        }
        return quantityLowerMonth;
    }

    public int getMonthsLargerAverage(int[] sales) {
        int quantityLargerMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= getAverageSum(sales)) {
                quantityLargerMonth++;
            }
        }
        return quantityLargerMonth;

    }
}
