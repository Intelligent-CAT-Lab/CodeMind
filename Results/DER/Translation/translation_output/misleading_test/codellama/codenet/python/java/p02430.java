<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            combs.add(new ArrayList<>());
        }

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < k; j++) {
                combs.get(j).add(l.get(i));
            }
        }

        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += (int) Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        List<List<Integer>> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            z.add(new ArrayList<>());
            z.get(i).add(sumlist.get(i));
            z.get(i).add(combs.get(i));
        }

        z = z.stream().sorted(Comparator.comparing(a -> a.get(0))).collect(Collectors.toList());

        sumlist = new ArrayList<>();
        combs = new ArrayList<>();
        for (List<Integer> a : z) {
            sumlist.add(a.get(0));
            combs.add(a.get(1));
        }

        for (int i = 0; i < sumlist.size(); i++) {
            String c_str = "";
            for (int c : combs.get(i)) {
                c_str += c + " ";
            }
            System.out.println(sumlist.get(i) + ": " + c_str);
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `ArrayList` class to store the list of numbers and the list of combinations. The `Math.pow` method is used to calculate the sum of the powers of 2 for each combination. The `Comparator` class is used to sort the list of sums and combinations in ascending order. Finally, the `System.out.println` method is used to print the results.</s>
