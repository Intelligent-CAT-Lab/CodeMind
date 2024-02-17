import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int ans = 0;
        ans += Math.max(0, 4 - X) * 100000;
        ans += Math.max(0, 4 - Y) * 100000;
        if (X == 1 && Y == 1) {
            ans += 400000;
        }
        System.out.println(ans);
    }

}

