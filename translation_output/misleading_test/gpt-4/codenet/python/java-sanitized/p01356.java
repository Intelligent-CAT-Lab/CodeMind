import java.util.Scanner;

public class p01356 {

    private static int solve() {
        Scanner scanner = new Scanner(System.in);
        // assuming the input is provided in a single line as in the Python example
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();

        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                return m - (p + q) * n;
            } else {
                int k = m / (p + q);
                return Math.min(m - k * (p + q), (k + 1) * (p + q) - m);
            }
        } else {
            int ans = m;
            for (int i = Math.min(n - 1, 40); i >= 0; i--) {
                long f = (long) p * pow(a, i) + (long) q * pow(b, i);
                if (m < f) {
                    ans = (int) Math.min(ans, f - m);
                } else {
                    m -= f;
                }
                ans = Math.min(ans, m);
            }
            return ans;
        }
    }

    // Helper method to replace Python's power operator **
    private static long pow(int base, int exponent) {
        return (long) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}