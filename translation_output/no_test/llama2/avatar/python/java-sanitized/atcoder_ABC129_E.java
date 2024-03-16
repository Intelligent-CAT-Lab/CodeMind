import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int mod = 1000000007;
        int[] pows = new int[1];
        pows[0] = 1;
        for (int i = 1; i <= 1000000000; i++) {
            pows[i] = (pows[i - 1] * 3) % mod;
        }
        int dp = 1;
        for (int i = 0; i < l; i++) {
            if (sc.next().charAt(0) == '1') {
                dp = (pows[i] + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}