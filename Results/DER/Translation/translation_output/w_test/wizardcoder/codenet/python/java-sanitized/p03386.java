import java.util.*;

public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        for (int p = A; p <= A + K; p++) {
            if (p <= B) {
                X.add(p);
            }
        }
        for (int q = B - K + 1; q <= B; q++) {
            if (q >= A) {
                Y.add(q);
            }
        }
        List<Integer> ans = new ArrayList<>(new HashSet<>(X));
        ans.addAll(new HashSet<>(Y));
        ans.sort(Comparator.naturalOrder());
        for (int i : ans) {
            System.out.println(i);
        }
    }
}