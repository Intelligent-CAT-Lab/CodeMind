Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        ArrayList<ArrayList<Integer>> combs = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <= k; i++) {
            for (ArrayList<Integer> c : combinations(l, i)) {
                combs.add(c);
            }
        }

        ArrayList<Integer> sumlist = new ArrayList<Integer>();
        for (ArrayList<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        ArrayList<Integer> sortedSumlist = new ArrayList<Integer>(sumlist);
        Collections.sort(sortedSumlist);

        ArrayList<ArrayList<Integer>> sortedCombs = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < sortedSumlist.size(); i++) {
            int sum = sortedSumlist.get(i);
            for (int j = 0; j < combs.size(); j++) {
                if (sumlist.get(j) == sum) {
                    sortedCombs.add(combs.get(j));
                }
            }
        }

        for (int i = 0; i < sortedSumlist.size(); i++) {
            int sum = sortedSumlist.get(i);
            ArrayList<Integer> comb = sortedCombs.get(i);
            String c_str = "";
            for (int j = 0; j < comb.size(); j++) {
                c_str += comb.get(j) + " ";
            }
            System.out.println(sum + ": " + c_str.trim());
        }
    }

    public static ArrayList<ArrayList<Integer>> combinations(ArrayList<Integer> l, int k) {
        ArrayList<ArrayList<Integer>> combs = new ArrayList<ArrayList<Integer>>();
        if (k == 0) {
            combs.add(new ArrayList<Integer>());
            return combs;
        }
        for (int i = 0; i < l.size(); i++) {
            ArrayList<Integer> c = new ArrayList<Integer>();
            c.add(l.get(i));
            for (ArrayList<Integer> cc : combinations(new ArrayList<Integer>(l.subList(i + 1, l.size())), k - 1)) {
                c.addAll(cc);
            }
            combs.add(c);
        }
        return combs;
    }
}
```<|endoftext|>
