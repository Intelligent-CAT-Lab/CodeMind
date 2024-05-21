import java.util.*;

public class p03952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        if (x == 1 || x == 2*N-1) {
            if (N!= 1) {
                System.out.println("No");
                System.exit(0);
            } else {
                System.out.println("Yes");
                System.out.println(1);
                System.exit(0);
            }
        }

        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2*N-x;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 2*N-1; i >= N+x-1; i--) {
            ans.add(i);
        }
        for (int i = 1; i < N+x; i++) {
            ans.add(i);
        }
        if (!smaller) {
            List<Integer> ans2 = new ArrayList<>();
            for (int i = 0; i < ans.size(); i++) {
                ans2.add(2*N-ans.get(i));
            }
            ans = ans2;
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}