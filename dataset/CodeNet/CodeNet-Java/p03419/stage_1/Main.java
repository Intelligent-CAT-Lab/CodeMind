import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        long n = in.nextLong(), m = in.nextLong();
        if(n == 2 || m == 2) {
            System.out.println(0);
            return;
        }
var newVariable_0 = Math.max(1, n - 2);var newVariable_1 = Math.max(1, m - 2);        long ans = Math.max(1, n - 2) * newVariable_1;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}