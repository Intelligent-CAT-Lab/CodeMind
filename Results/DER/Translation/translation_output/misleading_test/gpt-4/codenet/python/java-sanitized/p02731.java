import java.util.Scanner;

public class p02731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer
        int L = scanner.nextInt();

        // Calculate one-third of the input value
        double hen = (double) L / 3;

        // Print the cube of 'hen'
        System.out.println(Math.pow(hen, 3));

        // Close the scanner
        scanner.close();
    }
}