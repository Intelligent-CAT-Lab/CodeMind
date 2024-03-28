import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();

        // Calculate midpoint
        double mx = w / 2;
        double my = h / 2;

        // Initialize result array
        double[] res = new double[2];

        // Calculate area and check for center
        res[0] = w * h / 2;
        res[1] = (x == mx && y == my) ? 1 : 0;

        // Print result
        System.out.println(res[0] + " " + (int)res[1]);
    }
}