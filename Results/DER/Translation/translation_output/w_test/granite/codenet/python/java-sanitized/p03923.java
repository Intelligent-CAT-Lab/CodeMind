import java.util.*;

public class p03923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int t = n;
        for (int k = 1; k <= Math.ceil(Math.log(n) / Math.log(2)); k++) {
            int d = (int) Math.ceil(Math.pow(n, 1.0 / k));
            int l = 0, r = k;
            while (l + 1 < r) {
                int c = (l + r) / 2;
                if (n <= Math.pow(d - 1, k - c) * Math.pow(d, c)) {
                    r = c;
                } else {
                    l = c;
                }
            }
            t = Math.min(t, (d - 1) * (k - r) + d * r + (k - 1) * a);
        }
        System.out.println(t);
    }
}