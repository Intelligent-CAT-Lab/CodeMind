<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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
        for (int i = 0; i <= l.size(); i++) {
            combs.addAll(getCombinations(l, i));
        }

        List<Integer> sumList = new ArrayList<>();
        List<List<Integer>> combsList = new ArrayList<>();
        for (List<Integer> comb : combs) {
            if (comb.size() == k) {
                int sum = 0;
                for (int c : comb) {
                    sum += Math.pow(2, c);
                }
                sumList.add(sum);
                combsList.add(comb);
            }
        }

        List<Integer> sortedSumList = new ArrayList<>(sumList);
        Collections.sort(sortedSumList);

        List<Integer> sortedCombsList = new ArrayList<>();
        for (int sum : sortedSumList) {
            int index = sumList.indexOf(sum);
            sortedCombsList.add(index);
        }

        for (int i = 0; i < sortedSumList.size(); i++) {
            int sum = sortedSumList.get(i);
            List<Integer> comb = combsList.get(sortedCombsList.get(i));
            StringBuilder cStr = new StringBuilder();
            for (int c : comb) {
                cStr.append(c).append(" ");
            }
            System.out.println(sum + ": " + cStr.toString().trim());
        }
    }

    public static List<List<Integer>> getCombinations(List<Integer> list, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > list.size()) {
            return result;
        }
        if (k == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        for (int i = 0; i < list.size(); i++) {
            List<Integer> temp = new ArrayList<>(list.subList(i + 1, list.size()));
            for (List<Integer> a : getCombinations(temp, k - 1)) {
                a.add(0, list.get(i));
                result.add(a);
            }
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It first reads two integers `n` and `k` from the standard input. Then it generates a list `l` of integers from 0 to `n-1`. It generates all combinations of `k` elements from `l` and calculates the sum of the powers of 2 for each combination. It sorts the combinations based on their sums and prints them.<｜end▁of▁sentence｜>
