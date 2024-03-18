import java.util.Scanner;

public class p00411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read space-separated integers a, t, r
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();

        // Calculate the answer
        double ans = (double) r * t / a;

        // Print the answer formatted to six decimal places
        System.out.printf("%.6f%n", ans);

        scanner.close();
    }
}