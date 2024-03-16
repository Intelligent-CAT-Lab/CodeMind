import java.util.Scanner;

public class p03847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] memo = new int[N + 1];
        memo[0] = 1;
        memo[1] = 2;

        int result = 0;
        for (int i = 2; i <= N; i++) {
            result = (memo[i / 2] + memo[(i - 1) / 2] + memo[i / 2 - 1]) % (1000000007);
            memo[i] = result;
        }

        System.out.println(result);
    }
}