import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        while (Math.pow(2, d) <= l) {
            d++;
        }
        d--;
        int n = d + 1;
        int m = 2 * d;
        int[][] ans = new int[m][3];
        for (int i = 0; i < m; i++) {
            ans[i][0] = 0;
            ans[i][1] = 0;
            ans[i][2] = 0;
        }
        for (int i = 1; i < n; i++) {
            ans[i - 1][0] = i;
            ans[i - 1][1] = i + 1;
            ans[i - 1][2] = (int) Math.pow(2, i - 1);
            ans[i + d - 1][0] = i;
            ans[i + d - 1][1] = i + 1;
            ans[i + d - 1][2] = 0;
        }
        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans[m][0] = i;
                    ans[m][1] = n;
                    ans[m][2] = (int) (l - Math.pow(2, i - 1));
                    m++;
                    l -= Math.pow(2, i - 1);
                    break;
                }
            }
        }
        System.out.println(n + " " + m);
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
        }
    }
}