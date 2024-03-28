import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02427 {

    public static List<List<Integer>> generateSubsets(int n) {
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int v = 0; v < n; v++) {
                if ((i & (1 << v)) > 0) {
                    currentSubset.add(v);
                }
            }
            subsets.add(currentSubset);
        }
        return subsets;
    }

    public static void printSubsets(List<List<Integer>> subsets) {
        int i = 0;
        for (List<Integer> subset : subsets) {
            System.out.print(i++ + ":");
            for (int v : subset) {
                System.out.print(" " + v);
            }
            System.out.println();
        }
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> subsets = generateSubsets(n);
        printSubsets(subsets);
        scanner.close();
    }

    public static void main(String[] args) {
        run();
    }
}