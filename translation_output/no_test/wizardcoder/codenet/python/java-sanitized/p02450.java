import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p02450 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<List<Integer>> permutations = Arrays.stream(new int[n][n])
               .mapToObj(i -> Arrays.stream(i).boxed().collect(Collectors.toList()))
               .collect(Collectors.toList());
        for (List<Integer> p : permutations) {
            System.out.println(p.stream().mapToInt(i -> i).toArray());
        }
    }
}