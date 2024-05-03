import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p03952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

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

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2 * N - 1; i >= N + x - 1; i--) {
            ans.add(i);
        }
        for (int i = 1; i <= N + x - 1; i++) {
            ans.add(i);
        }

        if (!smaller) {
            Collections.reverse(ans);
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}