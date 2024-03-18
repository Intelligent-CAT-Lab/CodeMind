import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02427 {
    
    public static List<List<Integer>> subset(int n) {
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int v = 0; v < n; v++) {
                if ((i & (1 << v)) > 0) {
                    subset.add(v);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<List<Integer>> subsets = subset(n);

        for (int i = 0; i < subsets.size(); i++) {
            List<Integer> vs = subsets.get(i);
            System.out.print(i + ":");
            for (int v : vs) {
                System.out.print(" " + v);
            }
            System.out.println();
        }
    }
}