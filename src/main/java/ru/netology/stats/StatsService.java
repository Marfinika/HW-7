package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public long minAmount(long[] sales) {
        long minAmount = 0;
        long amount = 0;
        for (long sale : sales) {
            if (sale < -sales[(int) minAmount]) {
                minAmount = amount;
            }
            amount++;
        }
        return minAmount + 1;
    }

    public long belowAverage(long[] sales) {
        long sumBelowAverage = 0;
        long average = averageAmount(sales);
        for (long sale : sales) {
            if (sale < average) {
                sumBelowAverage++;
            }
        }
        return sumBelowAverage;
    }

    public long aboveAverage(long[] sales) {
        long sumAboveAverage = 0;
        long average = averageAmount(sales);
        for (long sale : sales) {
            if (sale > average) {
                sumAboveAverage++;
            }
        }
        return sumAboveAverage;
    }
}


