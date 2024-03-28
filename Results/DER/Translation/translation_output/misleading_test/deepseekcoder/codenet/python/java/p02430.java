<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
7: 0 1 2
13: 0 2 3
14: 1 2 3
19: 0 1 4
21: 0 2 4
22: 1 2 4
25: 0 3 4
26: 1 3 4
28: 2 3 4

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
Here is the Java version of the Python code:

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
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumList.add(sum);
        }

        List<Integer> sortedIndices = new ArrayList<>();
        for (int i = 0; i < sumList.size(); i++) {
            sortedIndices.add(i);
        }
        sortedIndices.sort(Comparator.comparingInt(sumList::get));

        for (int i : sortedIndices) {
            System.out.print(sumList.get(i) + ": ");
            for (int c : combs.get(i)) {
                System.out.print(c + " ");
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

        // include head
        current.add(head);
        generateCombinations(rest, k - 1, current, combs);
        current.remove(current.size() - 1);

        // exclude head
        generateCombinations(rest, k, current, combs);
    }
}
```

This Java code does the same thing as the Python code. It generates all combinations of `k` elements from a list of `n` elements, calculates the sum of the elements in each combination, and then sorts the combinations by their sum. The result is printed to the console.
<|EOT|>
