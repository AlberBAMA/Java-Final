import java.util.Scanner;

public class RainFallDemoProgramFinal {
    public static void main(String[] args) {

        final int MONTHS = 12;
        double[] yearlyRain = new double[MONTHS];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the 12 months' rain");

        // Filling the array
        for (int i = 0; i < MONTHS; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            double input = keyboard.nextDouble();

            // Validation cycle for non-negative
            while (input < 0) {
                System.out.print("Negative numbers are not accepted. Try again!");
                input = keyboard.nextDouble();
            }
            yearlyRain[i] = input;
        }

        // Instance of the RainFallFinal class
        RainFallFinal myRain = new RainFallFinal(yearlyRain);

        // Mostrar resultados
        System.out.println("\n---- Yearly results ------");
        System.out.printf("Yearly total: %.2f\n", myRain.getTotalRainFallFinal());
        System.out.printf("Monthly average: %.2f\n", myRain.getAverageRainFallFinal());
        System.out.println("Month with the most rain: " + myRain.getHtMonth());
        System.out.println("Month with the least rainfall: " + myRain.getLMonth());
    }
}
