package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void totalAmountAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        long actualSum = service.salesAmount(sales);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        long actualAverage = service.averageAmount(sales);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maximumSalesMonthNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minimumSalesMonthNumber() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        long actualSumMonth = service.belowAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void salesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        long actualSumMonth = service.aboveAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }
}