import java.util.Scanner;

public class p02769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (x * (2 * n - 1 - i)) % 1000000007;
            }
            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (y * (i + 1)) % 1000000007;
            }
            System.out.println((x * bp(y, 1000000005)) % 1000000007);
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 0; i < k; i++) {
                t = (t * (i + 1)) % 1000000007;
                y = (y * (n - 1 - i)) % 1000000007;
                y = (y * (n - i)) % 1000000007;
                int c = bp(t, 1000000005);
                x = (x + y * c * c) % 1000000007;
            }
            System.out.println(x);
        }
    }

    public static int bp(int a, int n) {
        int r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (r * a) % 1000000007;
            }
            a = (a * a) % 1000000007;
            n /= 2;
        }
        return r;
    }
}