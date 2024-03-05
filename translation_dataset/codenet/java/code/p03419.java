import java.util.Scanner;

public class p03419 {

    private Scanner in = new Scanner(System.in);

    void solve() {
        long n = in.nextLong(), m = in.nextLong();
        if(n == 2 || m == 2) {
            System.out.println(0);
            return;
        }
        long ans = Math.max(1, n - 2) * Math.max(1, m - 2);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new p03419().solve();
    }
}