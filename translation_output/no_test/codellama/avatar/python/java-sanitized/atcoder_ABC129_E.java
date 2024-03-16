import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int mod = 1000000007;
        int[] pows = new int[1000000 + 10];
        pows[0] = 1;
        for (int i = 1; i <= 1000000 + 10; i++) {
            pows[i] = (pows[i - 1] * 3) % mod;
        }
        int dp = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                dp = (pows[i] + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}