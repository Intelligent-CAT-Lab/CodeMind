import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        Set<Integer> ans = new TreeSet<>(); // TreeSet is sorted and doesn't allow duplicates

        for (int p = A; p <= A + K - 1 && p <= B; p++) {
            ans.add(p);
        }

        for (int q = B - K + 1; q <= B && q >= A; q++) {
            ans.add(q);
        }

        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}