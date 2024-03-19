import java.util.Scanner;

public class p01486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        boolean[][] dp = new boolean[length + 1][length + 1];

        // Initialize the dp array
        for (int i = 0; i <= length; i++) {
            dp[i][i] = true;
        }

        // Iterate over the length of the input
        for (int w = 3; w <= length; w += 3) {
            for (int left = 0; left <= length - w; left++) {
                int right = left + w;
                if (input.charAt(left) != 'm' || input.charAt(right - 1) != 'w') {
                    continue;
                }
                for (int mid = left + 1; mid < right; mid++) {
                    if (input.charAt(mid) == 'e' && dp[left + 1][mid] && dp[mid + 1][right - 1]) {
                        dp[left][right] = true;
                        break;
                    }
                }
            }
        }

        // Print the result
        if (dp[0][length]) {
            System.out.println("Cat");
        } else {
            System.out.println("Rabbit");
        }
    }
}