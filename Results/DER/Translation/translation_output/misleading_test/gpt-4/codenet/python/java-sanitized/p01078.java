import java.util.Scanner;

public class p01078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read N and K from input
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        // Constants
        final double PI = 3.1415926535897932384626433832795;

        // Calculate the area and print the result
        double area = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.println(area);
    }
}