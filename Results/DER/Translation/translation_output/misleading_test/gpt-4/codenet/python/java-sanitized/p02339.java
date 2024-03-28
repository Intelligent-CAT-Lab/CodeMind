import java.util.Scanner;

public class p02339 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input equivalent to 'n, k = LI()'
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        sc.close(); // Close the scanner

        // Initialize dp array equivalent to Python's list comprehension initialization
        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        // Main loop to populate the dp table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = dp[i][j] + (j + 1) * dp[i][j + 1];
                dp[i + 1][j + 1] %= MOD;
            }
        }

        // Print the result as per the Python code
        System.out.println(dp[n][k]);
    }
}