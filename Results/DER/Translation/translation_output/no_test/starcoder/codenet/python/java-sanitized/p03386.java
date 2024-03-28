import java.util.*;
public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        for (int i = A; i <= A + K; i++) {
            if (i <= B) {
                X.add(i);
            }
        }
        for (int i = B - K + 1; i <= B; i++) {
            if (i >= A) {
                Y.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.addAll(X);
        ans.addAll(Y);
        Collections.sort(ans);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}