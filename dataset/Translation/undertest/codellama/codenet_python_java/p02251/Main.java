public class p02251 {
    public static void main(String[] args) {
        int n = 100;
        int ans = 0;
        for (int x : new int[] {25, 10, 5, 1}) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}