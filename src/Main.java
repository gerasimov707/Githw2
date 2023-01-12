public class Main {

    public static void main(String[] args) {
        int[] sales = {100, 55, 900, 200};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("самая крупная продажа " + salesManager.max() + " долларов ");
        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
            System.out.println("средняя сумма " + average);
        }
    }
}
