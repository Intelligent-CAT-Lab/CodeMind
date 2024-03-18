import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class p03386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        Set<Integer> ans = new HashSet<>();

        for (int p = A; p < A + K && p <= B; p++) {
            ans.add(p);
        }

        for (int q = B - K + 1; q <= B && q >= A; q++) {
            ans.add(q);
        }

        ArrayList<Integer> sortedAns = new ArrayList<>(ans);
        Collections.sort(sortedAns);

        for (Integer i : sortedAns) {
            System.out.println(i);
        }

        scanner.close();
    }
}