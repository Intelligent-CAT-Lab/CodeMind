import java.util.Scanner;

public class p03847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] memo = new int[N + 1];
        memo[0] = 1;
        memo[1] = 2;
        System.out.println(func(N, memo));
    }

    public static int func(int N, int[] memo) {
        if (memo[N] != 0) {
            return memo[N];
        }
        int result = (func(N / 2, memo) + func((N - 1) / 2, memo) + func(N / 2 - 1, memo)) % (1000000007);
        memo[N] = result;
        return result;
    }
}