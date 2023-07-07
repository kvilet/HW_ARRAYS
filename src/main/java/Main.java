import ru.netology.stats.HW_ARRAYS.service.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = service.getSumSales(sales);
        System.out.println(sum);

        int average = service.getAverageSum(sales);
        System.out.println(average);

        int maxSales = service.getMaxSales(sales);
        System.out.println(maxSales);

        int minSales = service.getMinSales(sales);
        System.out.println(minSales);

        int quantityLowerMonth = service.getMonthsLowerAverage(sales);
        System.out.println(quantityLowerMonth);

        int quantityLargerMonth = service.getMonthsLargerAverage(sales);
        System.out.println(quantityLargerMonth);

    }
}
