import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p02450 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        List<List<Integer>> permutations = generatePermutations(n);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

    private static List<List<Integer>> generatePermutations(int n) {
        return IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Main::permute));
    }

    private static List<List<Integer>> permute(List<Integer> l) {
        if (l.size() == 1) {
            return Arrays.asList(l);
        }
        List<List<Integer>> permutations = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            Integer first = l.get(i);
            List<Integer> rest = l.subList(0, i)
                    .stream()
                    .collect(Collectors.toList());
            rest.addAll(l.subList(i + 1, l.size()));
            for (List<Integer> p : permute(rest)) {
                List<Integer> newPermutation = new ArrayList<>();
                newPermutation.add(first);
                newPermutation.addAll(p);
                permutations.add(newPermutation);
            }
        }
        return permutations;
    }
}