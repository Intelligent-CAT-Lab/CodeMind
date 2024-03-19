import java.util.*;

public class p02427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(j);
                }
            }
            subsets.add(subset);
        }
        for (int i = 0; i < subsets.size(); i++) {
            System.out.println("{}:{}".formatted(i, subsets.get(i)));
        }
    }
}