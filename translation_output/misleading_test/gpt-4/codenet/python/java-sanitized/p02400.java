import java.util.Scanner;

public class p02400 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble(); // Read the radius from the input

        double s = r * r * Math.PI; // Calculate the area of the circle
        double l = r * 2 * Math.PI; // Calculate the circumference of the circle

        System.out.printf("%.5f %.5f%n", s, l); // Print out the area and the circumference
    }
}