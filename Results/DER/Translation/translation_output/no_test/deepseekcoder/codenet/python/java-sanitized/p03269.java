import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = -1;
        for (int i = 0; i < 30; i++) {
            if ((1 << i) > l) {
                d = i - 1;
                break;
            }
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
                if ((l - (1 << (i - 1))) > ((1 << d) - 1)) {
                    ans.add(new int[]{i, n, l - (1 << (i - 1))});
                    m += 1;
                    l -= (1 << (i - 1));
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