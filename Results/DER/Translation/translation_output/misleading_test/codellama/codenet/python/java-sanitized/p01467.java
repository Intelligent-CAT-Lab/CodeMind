public static int solve(int[] A, int[] B, int K) {
    int n = A.length;
    int[] C = new int[n];
    return solve(A, B, C, K, n - 1, 0);
}

private static int solve(int[] A, int[] B, int[] C, int K, int i, int borrow) {
    if (i == -1) {
        return Integer.parseInt(Arrays.toString(C).replaceAll("[\\[\\]]", ""));
    }
    if (A[i] - borrow >= B[i]) {
        C[i] = A[i] - borrow - B[i];
        return solve(A, B, C, K, i - 1, 0);
    } else {
        C[i] = A[i] - borrow + 10 - B[i];
        if (K > 0) {
            return Math.max(solve(A, B, C, K - 1, i - 1, 0), solve(A, B, C, K, i - 1, 1));
        } else {
            return solve(A, B, C, K, i - 1, 1);
        }
    }
}