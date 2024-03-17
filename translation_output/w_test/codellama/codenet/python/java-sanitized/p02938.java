import java.util.Scanner;

public class p02938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(solve(L, R));
    }

    private static int solve(int L, int R) {
        if (L > R) {
            return 0;
        }
        if (L == 1) {
            return (1 + solve(2, R)) % MOD;
        }
        return (solve(L / 2, (R - 1) / 2) + solve((L + 1) / 2, R / 2) + solve((L + 1) / 2, (R - 1) / 2)) % MOD;
    }
}