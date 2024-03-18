import java.util.Scanner;

public class p03592 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String ans = "No";

        // Performing calculations
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                }
            }
        }
        
        // Printing the result
        System.out.println(ans + "M");
        scanner.close();
    }
}