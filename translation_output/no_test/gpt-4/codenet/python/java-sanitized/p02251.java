import java.util.Scanner;

public class p02251 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        int n = scanner.nextInt();
        int ans = 0;
        int[] coins = {25, 10, 5, 1};

        // Loop through each coin denomination and calculate the number of coins
        for (int x : coins) {
            ans += n / x;
            n %= x;
        }

        // Print the result
        System.out.println(ans);

        scanner.close();
    }
}