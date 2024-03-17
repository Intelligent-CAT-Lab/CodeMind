import java.util.*;
public class p03897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 1) {
                ans[i][0] = 1;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 6 == 1) {
                for (int j = 2; j < n; j++) {
                    if (j % 2 == 0) {
                        ans[i][j] = 1;
                    }
                }
            }
            if (i % 6 == 4) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 1) {
                        ans[i][j] = 1;
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if ((n - 1 + j) % 2 == 1) {
                ans[n - 1][j] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}