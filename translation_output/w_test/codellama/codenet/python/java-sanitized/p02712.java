public class p02712 {
    public static void main(String[] args) {
        int N = 15;
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}