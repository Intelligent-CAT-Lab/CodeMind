import java.util.*;

public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            X.add(A + i);
        }
        for (int i = 0; i < B - K + 1; i++) {
            Y.add(B - K + i);
        }
        Set<Integer> ans = new HashSet<>(X);
        ans.addAll(Y);
        List<Integer> sortedAns = new ArrayList<>(ans);
        sortedAns.sort(Collections.reverseOrder());
        for (int i : sortedAns) {
            System.out.println(i);
        }
    }
}