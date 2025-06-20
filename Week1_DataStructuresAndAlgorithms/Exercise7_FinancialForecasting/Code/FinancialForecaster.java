public class FinancialForecaster {
    public static double calculateFutureValue(double presentValue, double growthRate, int years){
        if(years==0) return presentValue;
        return calculateFutureValue(presentValue*(1+growthRate),growthRate,years-1);
    }

    public static double calculateFutureValueMemo(double presentValue, double growthRate, int years, double[] table){
        if(years==0) return presentValue;
        if(table[years]!=0) return table[years];
        table[years] = calculateFutureValueMemo(presentValue*(1+growthRate),growthRate,years-1,table);
        return table[years];
    }
}
