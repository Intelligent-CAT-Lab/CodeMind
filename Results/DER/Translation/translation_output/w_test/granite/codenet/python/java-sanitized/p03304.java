import java.util.*;

public class p03304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        double result;
        if (d > 0) {
            result = 2.0 * (n - d) * (m - 1) / Math.pow(n, 2);
        } else {
            result = (m - 1) / (double) n;
        }
        System.out.println(result);
    }
}