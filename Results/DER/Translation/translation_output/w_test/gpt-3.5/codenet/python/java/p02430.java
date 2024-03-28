```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = generateCombinations(l, k);

        List<Integer> sumList = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumList.add(sum);
        }
        
        List<Pair> z = new ArrayList<>();
        for (int i = 0; i < sumList.size(); i++) {
            z.add(new Pair(sumList.get(i), combs.get(i)));
        }

        Collections.sort(z);

        for (Pair pair : z) {
            StringBuilder cStr = new StringBuilder();
            for (int c : pair.comb) {
                cStr.append(c).append(" ");
            }
            System.out.println(pair.sum + ": " + cStr.toString().trim());
        }

        scanner.close();
    }

    static class Pair implements Comparable<Pair> {
        int sum;
        List<Integer> comb;

        Pair(int sum, List<Integer> comb) {
            this.sum = sum;
            this.comb = comb;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.sum, o.sum);
        }
    }

    static List<List<Integer>> generateCombinations(List<Integer> elements, int k) {
        List<List<Integer>> combs = new ArrayList<>();
        generateCombinationsHelper(elements, k, 0, new ArrayList<>(), combs);
        return combs;
    }

    static void generateCombinationsHelper(List<Integer> elements, int k, int start, List<Integer> current, List<List<Integer>> combs) {
        if (k == 0) {
            combs.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= elements.size() - k; i++) {
            current.add(elements.get(i));
            generateCombinationsHelper(elements, k - 1, i + 1, current, combs);
            current.remove(current.size() - 1);
        }
    }
}
```

