import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p02450 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<List<Integer>> result = generatePermutations(n);
        for (List<Integer> perm : result) {
            System.out.println(Arrays.toString(perm.toArray()));
        }
    }

    public static List<List<Integer>> generatePermutations(int n) {
        List<List<Integer>> result = Arrays.stream(new int[n])
               .boxed()
               .collect(Collectors.toList());
        for (int i = 0; i < n; i++) {
            result.set(i, Arrays.asList(i+1));
        }
        return result;
    }
}