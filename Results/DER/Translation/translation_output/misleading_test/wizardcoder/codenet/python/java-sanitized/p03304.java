import java.util.Scanner;

public class p03304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        if (d > 0) {
            double result = 2 * (n - d) * (m - 1) / Math.pow(n, 2);
            System.out.println(result);
        } else {
            double result = (m - 1) / n;
            System.out.println(result);
        }
    }
}