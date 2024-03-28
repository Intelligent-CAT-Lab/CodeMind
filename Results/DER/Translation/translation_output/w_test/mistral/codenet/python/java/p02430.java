<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
7: 0 1 2
11: 0 1 3
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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        Arrays.fill(l, 0);
        List<int[]> combs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            combs.add(new int[]{i});
        }
        List<Integer> sumlist = new ArrayList<>();
        for (int[] comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += (int) Math.pow(2, c);
            }
            sumlist.add(sum);
        }
        List<int[]> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            z.add(new int[]{sumlist.get(i), comb[i]});
        }
        Collections.sort(z, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int[] sum : z) {
            String c_str = String.join(" ", Arrays.toString(sum[1]));
            System.out.println(sum[0] + ": " + c_str);
        }
    }
}
```</s>
