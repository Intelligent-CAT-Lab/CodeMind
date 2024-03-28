import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now = (now + ((s.charAt(i) - '0') * powMod(10, s.length() - i - 1, 2019))) % 2019;
            ans += remain[now];
            remain[now]++;
        }
        
        ans += remain[0];
        
        System.out.println(ans);
        scanner.close();
    }

    // Calculates (base^exp) % mod using a method that prevents overflow for large exponents
    private static int powMod(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}