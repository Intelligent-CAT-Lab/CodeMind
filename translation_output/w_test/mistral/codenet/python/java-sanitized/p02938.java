import java.util.*;

public class p02938 {
    final static int MOD = 1000000007;

    public static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % MOD;
        return (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[2];
        for (int i = 0; i < 2; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(solve(input[0], input[1]));
    }
}