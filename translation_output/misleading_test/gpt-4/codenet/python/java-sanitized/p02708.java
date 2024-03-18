import java.util.Scanner;

public class p02708 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        scanner.close();
        
        long ans = 0;
        long mod = (long)1e9 + 7;
        
        for (int i = k; i <= n + 1; i++) {
            long maxSum = ((long)(2 * n - i + 1) * i) / 2;
            long minSum = ((long)i * (i - 1)) / 2;
            ans = (ans + (maxSum - minSum + 1)) % mod;
        }
        
        System.out.println(ans);
    }
}