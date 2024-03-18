import java.util.Scanner;

public class p02554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        long ant = 1, bnt = 1, cnt = 1;
        final int MOD = 1000000007;
        
        for (int i = 0; i < n; i++) {
            ant = 10L * ant % MOD;
            bnt = 9L * bnt % MOD;
            cnt = 8L * cnt % MOD;
        }
        
        long ans = (ant - (bnt * 2L - cnt)) % MOD;
        
        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(MOD + ans);
        }

        scanner.close();
    }
}