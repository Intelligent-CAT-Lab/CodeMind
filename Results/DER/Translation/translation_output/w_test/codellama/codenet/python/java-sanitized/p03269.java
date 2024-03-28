import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int d = 0;
        for (int i = 30; i >= 0; i--) {
            if (2^i <= l) {
                d = i;
                break;
            }
        }

        int n = d + 1;
        int m = 2 * d;
        int[][] ans = new int[n][3];

        for (int i = 1; i < n; i++) {
            ans[i][0] = i;
            ans[i][1] = i + 1;
            ans[i][2] = 0;
        }

        while (l > 2^d) {
            for (int i = n - 1; i >= 0; i--) {
                if (l - 2^i > 2^d - 1) {
                    ans[i][0] = i;
                    ans[i][1] = n;
                    ans[i][2] = l - 2^i;
                    m += 1;
                    l -= 2^i;
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
}


Next, it calculates the values of `n` and `m` using the formulae `n = d + 1` and `m = 2 * d`.