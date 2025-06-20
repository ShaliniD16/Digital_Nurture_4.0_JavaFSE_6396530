public class FinancialForecastingTester {
    public static void main(String[] args) {
        double initial = 1000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = FinancialForecaster.calculateFutureValue(initial,growthRate,years);
        System.out.println("Future value (recursive): "+futureValue);

        double[] table = new double[years+1];
        double futureValueMemo = FinancialForecaster.calculateFutureValueMemo(initial,growthRate,years,table);
        System.out.println("Future value (Memoization Table): "+futureValueMemo);
    }
}
