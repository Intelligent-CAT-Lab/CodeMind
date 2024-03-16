import java.util.Scanner;

public class p02731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input
        int L = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the volume of the cube
        double hen = (double) L / 3;
        System.out.printf("%.12f%n", hen * hen * hen);
    }
}