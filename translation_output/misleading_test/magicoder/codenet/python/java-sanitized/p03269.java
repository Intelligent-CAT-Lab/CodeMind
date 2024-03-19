import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = (int) (Math.log(l) / Math.log(2));
        int n = d + 1;
        int m = 2 * d;

        int[][] ans = new int[m][3];
        int index = 0;

        for (int i = 1; i < n; i++) {
            ans[index][0] = i;
            ans[index][1] = i + 1;
            ans[index][2] = 0;
            index++;

            ans[index][0] = i;
            ans[index][1] = i + 1;
            ans[index][2] = (int) Math.pow(2, i - 1);
            index++;
        }

        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans[index][0] = i;
                    ans[index][1] = n;
                    ans[index][2] = (int) (l - Math.pow(2, i - 1));
                    m++;
                    l -= (int) Math.pow(2, i - 1);
                    index++;
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