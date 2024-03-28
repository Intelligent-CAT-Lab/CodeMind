import java.util.Scanner;

public class p01078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double PI = 3.1415926535897932384626433832795;
        double area = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.printf("%.15f\n", area);
    }
}