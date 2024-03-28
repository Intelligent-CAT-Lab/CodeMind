public class p02251 {
    public static void main(String[] args) {
        int n = 100;
        int ans = 0;
        for (int x = 25; x >= 1; x /= 5) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}