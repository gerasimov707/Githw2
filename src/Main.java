public class Main {

    public static void main(String[] args) {
        long[] sales = {100,0,900,200};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("самая крупная продажа " + salesManager.max() + " долларов ");


        }
    }

