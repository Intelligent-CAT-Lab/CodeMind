import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = 0;
        for (int i = 0; i < 30; i++) {
            if ((1 << i) <= l) d = i;
        }
        int n = d + 1;
        int m = 2 * d;
        List<int[]> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, 1 << (i - 1)});
        }

        while (l > (1 << d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - (1 << (i - 1)) > (1 << d) - 1) {
                    ans.add(new int[]{i, n, l - (1 << (i - 1))});
                    m++;
                    l -= (1 << (i - 1));
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + (i < a.length - 1 ? " " : "\n"));
            }
        }

        scanner.close();
    }
}