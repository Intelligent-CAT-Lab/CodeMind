public class p03799 {
    public int solution(int N, int M) {
        int ans = 0;
        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }
        return ans;
    }
}