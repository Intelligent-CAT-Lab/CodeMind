<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import itertools

n, k = map(int, input().split())

l = range(n)
combs = list(itertools.combinations(l, k))

sumlist = []
for comb in combs:
    sum = 0
    for c in comb:
        sum += pow(2, c)
    sumlist.append(sum)

z = zip(sumlist, combs)
z = sorted(z)

sumlist, combs = zip(*z)

for sum, comb in zip(sumlist, combs):
    c_str = (' '.join(str(c) for c in comb))
    print(str(sum) + ": " + c_str)

```

### Response:
```java
import java.util.*;

public class Main {
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

        List<Integer> sumList = new ArrayList<>();
        List<List<Integer>> combList = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumList.add(sum);
            combList.add(comb);
        }

        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < sumList.size(); i++) {
            pairs.add(new Pair(sumList.get(i), combList.get(i)));
        }

        pairs.sort(Comparator.comparingInt(Pair::getSum));

        for (Pair pair : pairs) {
            System.out.print(pair.getSum() + ": ");
            for (int i = 0; i < pair.getComb().size(); i++) {
                System.out.print(pair.getComb().get(i));
                if (i != pair.getComb().size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void generateCombinations(List<Integer> l, int k, List<Integer> current, List<List<Integer>> combs) {
        if (k == 0) {
            combs.add(new ArrayList<>(current));
            return;
        }
        if (l.isEmpty()) {
            return;
        }

        int head = l.get(0);
        List<Integer> rest = l.subList(1, l.size());

        current.add(head);
        generateCombinations(rest, k - 1, current, combs);
        current.remove(Integer.valueOf(head));
        generateCombinations(rest, k, current, combs);
    }

    static class Pair {
        private final int sum;
        private final List<Integer> comb;

        public Pair(int sum, List<Integer> comb) {
            this.sum = sum;
            this.comb = comb;
        }

        public int getSum() {
            return sum;
        }

        public List<Integer> getComb() {
            return comb;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `k` from the input, generates all combinations of `k` elements from the range from 0 to `n-1`, calculates the sum of the powers of 2 for each combination, sorts the sums and combinations in ascending order, and prints the sums and corresponding combinations.
<|EOT|>
