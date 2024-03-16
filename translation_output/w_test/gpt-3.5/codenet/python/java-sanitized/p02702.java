import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += Character.getNumericValue(s.charAt(i)) * pow(10, s.length() - i - 1, 2019);
            ans += remain[now % 2019];
            remain[now % 2019]++;
        }

        ans += remain[0];

        System.out.println(ans);
    }

    public static int pow(int base, int exponent, int mod) {
        int result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent /= 2;
        }
        return result;
    }
}