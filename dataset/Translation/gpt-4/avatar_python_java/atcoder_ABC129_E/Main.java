import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = new StringBuilder(scanner.nextLine()).reverse().toString();
        final int mod = 1000000007; // 10**9 + 7
        int[] pows = new int[100005]; // 10**5 + 10
        pows[0] = 1;
        for (int i = 1; i < pows.length; i++) {
            pows[i] = (int)(((long)pows[i - 1] * 3) % mod);
        }
        long dp = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '1') {
                dp = (dp * 2 + pows[i]) % mod;
            }
        }
        System.out.println(dp);
        scanner.close();
    }
}