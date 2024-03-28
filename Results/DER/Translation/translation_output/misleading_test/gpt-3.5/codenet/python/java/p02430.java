```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class PowerCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        generateCombinations(l, k, new ArrayList<>(), combs);

        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        List<Pair> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            z.add(new Pair(sumlist.get(i), combs.get(i)));
        }

        Collections.sort(z);

        sumlist.clear();
        combs.clear();
        for (Pair pair : z) {
            sumlist.add(pair.sum);
            combs.add(pair.comb);
        }

        for (int i = 0; i < sumlist.size(); i++) {
            List<Integer> comb = combs.get(i);
            StringBuilder c_str = new StringBuilder();
            for (int c : comb) {
                c_str.append(c).append(" ");
            }
            System.out.println(sumlist.get(i) + ": " + c_str.toString().trim());
        }
    }

    static void generateCombinations(List<Integer> l, int k, List<Integer> current, List<List<Integer>> combs) {
        if (k == 0) {
            combs.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < l.size(); i++) {
            current.add(l.get(i));
            generateCombinations(l.subList(i + 1, l.size()), k - 1, current, combs);
            current.remove(current.size() - 1);
        }
    }

    static class Pair implements Comparable<Pair> {
        int sum;
        List<Integer> comb;

        public Pair(int sum, List<Integer> comb) {
            this.sum = sum;
            this.comb = comb;
        }

        @Override
        public int compareTo(Pair other) {
            return this.sum - other.sum;
        }
    }
}
```
```
