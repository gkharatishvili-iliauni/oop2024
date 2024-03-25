public class CoffeeShop {
    public static void main(String[] args) {
        int pricePerCoffee = 250;
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000;
        int totalExpenses = 6000 + 84 + 131 + 17200 + 3100;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, totalExpenses);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int totalExpenses) {
        double profitInLaris = (pricePerCoffee + numCoffeeSold + totalCostOfBeans + totalExpenses) / 100;

        return profitInLaris;
    }
}