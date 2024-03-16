import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int d = 0;
        int n = 0;
        int m = 0;
        int[] ans = new int[l];

        for (int i = 0; i < l; i++) {
            if (2 * d <= l) {
                d++;
            }
            n = d + 1;
            m = 2 * d;
            ans[i] = (i, i + 1, 0);
            ans[i] = (i, i + 1, 2 ** (i - 1));
        }

        while (l > 2 ** d) {
            for (int i = n - 1; i > 0; i--) {
                if (l - 2 ** (i - 1) > 2 ** d - 1) {
                    ans[i] = (i, n, l - 2 ** (i - 1));
                    m += 1;
                    l -= 2 ** (i - 1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int i = 0; i < l; i++) {
            System.out.println(ans[i]);
        }
    }
}