import java.util.Scanner;
import java.lang.Math;

public class p01078 {
    public static void main(String[] args) {
        final double PI = 3.1415926535897932384626433832795;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double area = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.println(area);
    }
}