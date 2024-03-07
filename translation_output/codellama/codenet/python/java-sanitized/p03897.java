import java.util.Scanner;

public class p03897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ans = new int[n][2];
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 1) {
                ans[i][0] = i;
                ans[i][1] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 6 == 1) {
                for (int j = 2; j < n; j++) {
                    if (j % 2 == 0) {
                        ans[i][0] = i;
                        ans[i][1] = j;
                    }
                }
            }
            if (i % 6 == 4) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 1) {
                        ans[i][0] = i;
                        ans[i][1] = j;
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if ((n - 1 + j) % 2 == 1) {
                ans[n - 1][0] = n - 1;
                ans[n - 1][1] = j;
            }
        }
        System.out.println(ans.length);
        for (int[] pair : ans) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}