public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input.length];
        int[] B = new int[input.length];
        int K = Integer.parseInt(input[2]);
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < input.length; i++) {
            B[i] = Integer.parseInt(input[i]);
        }
        int n = A.length;
        B = new int[Math.max(0, n - B.length) + B.length];
        int[] C = new int[n];
        System.out.println(solve(C, K, n - 1, 0));
    }

    public static int solve(int[] C, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt("".join(Map.of(C)));
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, K, i - 1, 0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0), solve(C, K, i - 1, 1));
            } else {
                return solve(C, K, i - 1, 1);
            }
        }
    }
}