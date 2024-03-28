public class p03544 {
    public static void main(String[] args) {
        int n = 5;
        int result = fib(n + 1);
        System.out.println(result);
    }

    public static int fib(int n) {
        int[] memo = new int[n];
        memo[0] = 2;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }
}