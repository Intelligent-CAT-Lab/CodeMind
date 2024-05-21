public class p03544 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] memo = new int[N + 1];
        memo[0] = 2;
        memo[1] = 1;
        for (int i = 2; i <= N; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        System.out.println(memo[N]);
    }
}