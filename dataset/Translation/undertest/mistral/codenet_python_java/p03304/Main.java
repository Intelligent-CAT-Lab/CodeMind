import java.util.Scanner;

public class p03304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, d;
        n = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
        if (d > 0) {
            System.out.println(2 * (n - d) * (m - 1) / Math.pow(n, 2));
        } else {
            System.out.println((m - 1) / n);
        }
    }
}