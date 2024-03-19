<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = i;
        }
        int[][] combs = new int[n - k + 1][k];
        int[] sumlist = new int[n - k + 1];
        int[] comb = new int[k];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            comb[count] = i;
            sum += Math.pow(2, i);
            count++;
            if (count == k) {
                count = 0;
                combs[i - k + 1] = comb.clone();
                sumlist[i - k + 1] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i < n - k + 1; i++) {
            System.out.print(sumlist[i] + ": ");
            for (int j = 0; j < k; j++) {
                System.out.print(combs[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

'''
<|endoftext|>
