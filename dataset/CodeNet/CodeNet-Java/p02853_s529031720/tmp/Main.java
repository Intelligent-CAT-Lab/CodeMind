import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
System.out.println("[INST]9;None;thread.start();"+thread.start());
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int X = scanner.nextInt();
System.out.println("[INST]19;X;scanner.nextInt();"+X);
        int Y = scanner.nextInt();
System.out.println("[INST]20;Y;scanner.nextInt();"+Y);
        int ans = 0;
        ans += Math.max(0, 4 - X) * 100000;
System.out.println("[INST]22;None;Math.max(0, 4 - X);"+Math.max(0, 4 - X));
        ans += Math.max(0, 4 - Y) * 100000;
System.out.println("[INST]23;None;Math.max(0, 4 - Y);"+Math.max(0, 4 - Y));
        if (X == 1 && Y == 1) {
            ans += 400000;
        }
        System.out.println(ans);
    }

}

