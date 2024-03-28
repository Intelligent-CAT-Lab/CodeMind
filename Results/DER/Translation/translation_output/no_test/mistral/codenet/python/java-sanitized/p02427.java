import java.util.ArrayList;
import java.util.List;

public class p02427 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        List<List<Integer>> subsets = subset(n);
        for (int i = 0; i < subsets.size(); i++) {
            System.out.println("{}:{}".formatted(i, " ".join(subsets.get(i).stream().mapToObj(String::valueOf).toArray(String[]::new))));
        }
    }

    public static List<List<Integer>> subset(int n) {
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> vs = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    vs.add(j);
                }
            }
            subsets.add(vs);
        }
        return subsets;
    }
}