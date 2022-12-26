public class Main {

    public static void main(String[] args) {
        int[] sales = {100,55,900,200};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("самая крупная продажа " + salesManager.max() + " долларов  ");
    }
}
