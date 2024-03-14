import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.next();
        long mod = (long)Math.pow(10, 9) + 7;
        long[] pows = new long[100005 + 10];
        pows[0] = 1;
        for (int i = 1; i < 100005 + 10; i++) {
            pows[i] = (pows[i - 1] * 3) % mod;
        }
        long dp = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '1') {
                dp = (pows[i] + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}