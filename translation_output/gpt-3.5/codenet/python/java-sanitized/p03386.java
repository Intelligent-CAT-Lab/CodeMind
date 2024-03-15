import java.util.*;

public class p03386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> X = new ArrayList<>();
        for (int p = A; p <= A + K; p++) {
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

        Set<Integer> ansSet = new HashSet<>(X);
        ansSet.addAll(Y);

        List<Integer> ans = new ArrayList<>(ansSet);
        Collections.sort(ans);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}