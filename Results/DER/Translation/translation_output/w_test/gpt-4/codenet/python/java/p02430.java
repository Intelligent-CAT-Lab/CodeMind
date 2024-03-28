Below is the translated Java code corresponding to the provided Python script:

```java
import java.util.*;

public class CombinationSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<int[]> combs = generateCombinations(n, k);

        List<Integer> sumlist = new ArrayList<>();
        for (int[] comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        // Pair sums with their corresponding combinations before sorting
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            pairs.add(new Pair(sumlist.get(i), combs.get(i)));
        }

        // Sort the pairs based on the sum values
        pairs.sort(Comparator.comparingInt(pair -> pair.sum));

        // Print the sorted sums and combinations
        for (Pair pair : pairs) {
            String cStr = Arrays.stream(pair.comb)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(" "));
            System.out.println(pair.sum + ": " + cStr);
        }

        scanner.close();
    }

    // Helper method to generate all k-combinations of numbers from 0 to n-1
    private static List<int[]> generateCombinations(int n, int k) {
        List<int[]> combs = new ArrayList<>();
        int[] comb = new int[k];
        generateCombinations(0, 0, n, k, combs, comb);
        return combs;
    }

    private static void generateCombinations(int start, int depth, int n, int k,
                                             List<int[]> combs, int[] comb) {
        if (depth == k) {
            combs.add(comb.clone());
            return;
        }

        for (int i = start; i < n; i++) {
            comb[depth] = i;
            generateCombinations(i + 1, depth + 1, n, k, combs, comb);
        }
    }

    // Helper class to hold a sum and its corresponding combination
    static class Pair {
        int sum;
        int[] comb;

        Pair(int sum, int[] comb) {
            this.sum = sum;
            this.comb = comb;
        }
    }
}
```

This Java program accepts input in the same format as the Python script. It uses a recursive method `generateCombinations` to find all the k-combinations of the numbers from 0 to n-1, which emulates the functionality of Python's `itertools.combinations`. The program generates the sums and corresponding combinations, sorts them by the sums, and then prints them in the desired format.
