import java.util.Scanner;

public class p03929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] r = new int[12];
        for (int i = 1; i <= 11; i++) {
            int m = 0;
            for (int j = 1; j <= 5; j++) {
                int t = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        t += 7 * (i + y) + (j + x) - 7;
                    }
                }
                if (t % 11 == k) {
                    m++;
                }
            }
            r[i] = m;
        }

        int a = n / 11;
        int b = n % 11;
        int ans = 0;
        ans += a * r.length;
        if (b < 1) {
            ans -= r[r.length - 2];
        }
        if (b < 2) {
            ans -= r[r.length - 1];
        }
        if (b >= 3) {
            for (int i = 0; i < b - 2; i++) {
                ans += r[i];
            }
        }
        System.out.println(ans);
    }
}