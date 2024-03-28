import java.util.Scanner;

public class p02400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble(); // User input for radius

        double s = r * r * Math.PI; // Area of the circle
        double l = r * 2 * Math.PI; // Circumference of the circle

        System.out.printf("%.5f %.5f%n", s, l); // Formatted output
    }
}