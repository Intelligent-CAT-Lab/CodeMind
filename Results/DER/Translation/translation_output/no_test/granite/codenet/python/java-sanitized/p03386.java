import java.util.*;

public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        List<Integer> X = new ArrayList<>();
        for (int p = A; p < A + K; p++) {
            if (p <= B) {
                X.add(p);
            }
        }

        List<Integer> Y = new ArrayList<>();
        for (int q = B - K + 1; q <= B; q++) {
            if (q >= A) {
                Y.add(q);
            }
        }

        List<Integer> ans = new ArrayList<>(X);
        ans.addAll(Y);
        Collections.sort(ans);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}