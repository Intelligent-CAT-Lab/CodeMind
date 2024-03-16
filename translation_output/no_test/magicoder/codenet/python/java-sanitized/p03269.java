import java.util.Scanner;
import java.util.ArrayList;

public class p03269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = 0;
        for (int i = 0; i < 30; i++) {
            if ((int)Math.pow(2, i) <= l) {
                d = i;
            }
        }
        int n = d + 1;
        int m = 2 * d;
        ArrayList<int[]> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, (int)Math.pow(2, i - 1)});
        }

        while (l > (int)Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - (int)Math.pow(2, i - 1) > (int)Math.pow(2, d) - 1) {
                    ans.add(new int[]{i, n, l - (int)Math.pow(2, i - 1)});
                    m += 1;
                    l -= (int)Math.pow(2, i - 1);
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