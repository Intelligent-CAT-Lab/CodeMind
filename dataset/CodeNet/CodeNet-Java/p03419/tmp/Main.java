import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        long n = in.nextLong(), m = in.nextLong();
System.out.println("[INST]7;n;in.nextLong();"+n);
System.out.println("[INST]7;m;in.nextLong();"+m);
        if(n == 2 || m == 2) {
            System.out.println(0);
            return;
        }
        long ans = Math.max(1, n - 2) * Math.max(1, m - 2);
System.out.println("[INST]12;None;Math.max(1, n - 2);"+Math.max(1, n - 2));
System.out.println("[INST]12;None;Math.max(1, m - 2);"+Math.max(1, m - 2));
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}