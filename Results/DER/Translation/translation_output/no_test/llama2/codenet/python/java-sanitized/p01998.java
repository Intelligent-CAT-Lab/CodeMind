public class p01998 {
    public int solution(int n) {
        int root = (int) Math.sqrt(n);
        boolean[] isPrime = new boolean[n + 3];
        Arrays.fill(isPrime, true);
        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i <= n; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2;
                }
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return ans;
    }
}