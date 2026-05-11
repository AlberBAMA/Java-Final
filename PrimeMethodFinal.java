import java.util.Scanner;


public class PrimeMethodFinal {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);

        // Ask for a number
        System.out.print("Type a number in order to see if it is prime: ");
        number = keyboard.nextInt();

        // Call the method isPrime
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime.");
        } else {
            System.out.println("The number " + number + " is not prime.");
        }
    }




    // Method to see if it is prime or not
    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        // Loop to find divisors
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If the remainder is 0, it means that "i" is a divisor and the number is not prime.
            if (num % i == 0) {
                return false;
            }}

        return true;
    }
}
