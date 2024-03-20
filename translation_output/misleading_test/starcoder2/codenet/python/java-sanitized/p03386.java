import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int p = A; p < A + K; p++) {
            if (p <= B) {
                X.add(p);
            }
        }
        for (int q = B - K + 1; q < B + 1; q++) {
            if (q >= A) {
                Y.add(q);
            }
        }
        ans.addAll(X);
        ans.addAll(Y);
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}

/2019-09-16/README.md
# 2019-09-16