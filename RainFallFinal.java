public class RainFallFinal {

    //12 months array
    private double[] rain;

    // Constructor
    public RainFallFinal(double[] RainFallFinalArray) {
        rain = new double[RainFallFinalArray.length];
        for (int i = 0; i < RainFallFinalArray.length; i++) {
            rain[i] = RainFallFinalArray[i];
        }
    }

    // Anual Total
    public double getTotalRainFallFinal() {
        double total = 0;
        for (double value : rain) {
            total += value;
        }
        return total;
    }

    // Monthly average
    public double getAverageRainFallFinal() {
        return getTotalRainFallFinal() / rain.length;
    }

    // Month with the most rain
    public int getHtMonth() {
        int highest = 0;
        for (int i = 1; i < rain.length; i++) {
            if (rain[i] > rain[highest]) {
                highest = i;
            }
        }
        return highest + 1;
    }

    // Month with the least rainfall
    public int getLMonth() {
        int lowest = 0;
        for (int i = 1; i < rain.length; i++) {
            if (rain[i] < rain[lowest]) {
                lowest = i;
            }
        }
        return lowest + 1;
    }
}
