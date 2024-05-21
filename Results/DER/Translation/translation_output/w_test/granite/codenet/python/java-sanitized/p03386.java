import java.util.*;

public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        List<Integer> ans = new ArrayList<>();
        for (int i = A; i <= B; i++) {
            if (i <= B - K + 1) {
                ans.add(i);
            }
            if (i >= A && i <= B - K + 1) {
                ans.add(i);
            }
        }

        Collections.sort(ans);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}