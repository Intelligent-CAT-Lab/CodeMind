import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        long[] remain = new long[2019];
        long now = 0;
        long ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (s.charAt(i) - '0') * pow(10, s.length() - i - 1, 2019);
            ans += remain[(int)(now % 2019)];
            remain[(int)(now % 2019)]++;
        }

        ans += remain[0];

        System.out.println(ans);
    }

    private static long pow(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}