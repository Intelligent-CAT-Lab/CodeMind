import java.util.*;

public class p03952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
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
        for (int i = 2 * N - 1; i >= 1; i--) {
            ans.add(i);
        }
        if (!smaller) {
            for (int i = 0; i < ans.size(); i++) {
                ans.set(i, 2 * N - ans.get(i));
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}