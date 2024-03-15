public class atcoder_ABC114_C {
    public int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        for (int i = 0; i < 3; i++) {
            ans += aaa(n + i);
        }
        return ans;
    }
}