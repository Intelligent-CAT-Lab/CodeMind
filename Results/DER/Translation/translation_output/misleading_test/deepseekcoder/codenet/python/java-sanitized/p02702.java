import java.util.*;

public class p02702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] remain = new int[2019];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (s.charAt(i) - '0') * pow(10, s.length() - i - 1, 2019);
            ans += remain[now % 2019];
            remain[now % 2019] += 1;
        }

        ans += remain[0];

        System.out.println(ans);
    }

    private static int pow(int a, int b, int mod) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
}