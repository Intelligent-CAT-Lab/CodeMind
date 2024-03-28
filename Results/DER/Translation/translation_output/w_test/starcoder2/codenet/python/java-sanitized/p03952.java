import java.util.Scanner;

public class p03952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                return;
            } else {
                System.out.println("Yes");
                System.out.println(1);
                return;
            }
        }
        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }
        int[] ans = new int[2 * N - 1];
        for (int i = 0; i < 2 * N - 1; i++) {
            if (i < 2 * N - 1 - x) {
                ans[i] = 2 * N - 1 - i;
            } else {
                ans[i] = i - 2 * N + 1 + x;
            }
        }
        if (!smaller) {
            for (int i = 0; i < 2 * N - 1; i++) {
                ans[i] = 2 * N - ans[i];
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < 2 * N - 1; i++) {
            System.out.println(ans[i]);
        }
    }
}