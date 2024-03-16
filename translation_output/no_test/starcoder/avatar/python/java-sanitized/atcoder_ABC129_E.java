import java.util.*;
public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int mod = 1000000007;
        int[] pows = new int[100001];
        pows[0] = 1;
        for (int i = 1; i < pows.length; i++) {
            pows[i] = (pows[i - 1] * 3) % mod;
        }
        int dp = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                dp = (pows[i] + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}