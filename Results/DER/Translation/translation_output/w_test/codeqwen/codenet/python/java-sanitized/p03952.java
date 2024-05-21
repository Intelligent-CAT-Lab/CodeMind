import java.util.Scanner;

public class p03952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();

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
        int index = 0;
        for (int i = 2 * N - 1; i >= N + x - 1; i--) {
            ans[index++] = i;
        }
        for (int i = 1; i <= N + x - 1; i++) {
            ans[index++] = i;
        }

        if (!smaller) {
            for (int i = 0; i < ans.length; i++) {
                ans[i] = 2 * N - ans[i];
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}