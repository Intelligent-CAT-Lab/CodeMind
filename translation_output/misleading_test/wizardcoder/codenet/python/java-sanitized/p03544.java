public class p03544 {
    public static int fib(int n) {
        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(fib(N + 1));
    }
}