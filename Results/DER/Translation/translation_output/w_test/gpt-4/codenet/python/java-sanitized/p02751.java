import java.util.Scanner;

public class p02751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] ans = new String[(1 << n) - 1][(1 << m) - 1];

        // Initialize the ans array with "1" values
        for (int i = 0; i < (1 << n) - 1; i++) {
            for (int j = 0; j < (1 << m) - 1; j++) {
                ans[i][j] = "1";
            }
        }

        // Perform the operations as in the Python code
        for (int k = 1; k < 11; k++) {
            for (int i = (1 << k); i < (1 << n); i += (1 << k)) {
                for (int j = (1 << k); j < (1 << m); j += (1 << k)) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }

        // Print the result as in the Python code
        for (int i = 0; i < (1 << n) - 1; i++) {
            for (int j = 0; j < (1 << m) - 1; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}