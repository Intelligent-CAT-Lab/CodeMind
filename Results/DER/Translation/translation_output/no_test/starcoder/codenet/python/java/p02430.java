<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> comb = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    comb.add(j);
                }
            }
            combs.add(comb);
        }
        List<Integer> sumlist = new ArrayList<Integer>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }
        List<Integer> sumlist_sorted = new ArrayList<Integer>(sumlist);
        Collections.sort(sumlist_sorted);
        List<List<Integer>> combs_sorted = new ArrayList<List<Integer>>();
        for (int sum : sumlist_sorted) {
            for (List<Integer> comb : combs) {
                if (sum == sumlist[combs.indexOf(comb)]) {
                    combs_sorted.add(comb);
                }
            }
        }
        for (int i = 0; i < sumlist_sorted.size(); i++) {
            System.out.print(sumlist_sorted.get(i) + ": ");
            for (int j = 0; j < combs_sorted.get(i).size(); j++) {
                System.out.print(combs_sorted.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
```
<|endoftext|>
