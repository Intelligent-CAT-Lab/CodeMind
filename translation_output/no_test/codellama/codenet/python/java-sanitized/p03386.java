import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

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
        ans.sort(null);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}