<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
3 4
1 2 1
1 2 0
2 3 2
2 3 0

```
# coding: utf-8
import sys

sr = lambda: sys.stdin.readline().rstrip()
ir = lambda: int(sr())
lr = lambda: list(map(int, sr().split()))

L = ir()
edges = []
length = L.bit_length()
for i in range(1, length):
    edges.append((i, i+1, 2**(i-1)))
    edges.append((i, i+1, 0))

# 2**(length-1)-1ã¾ã§ã®æ°ã¯å®äº
# Lã«è¿ãåãç«¯ããå¦çãã¦ãã
for i in range(length-1):
    if L >> i & 1:
        L -= 2 ** i
        edges.append((i+1, length, L))

print(length, len(edges))
for x in edges:
    print(*x)

```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[][] edges = new int[length][3];
        for (int i = 0; i < length; i++) {
            edges[i][0] = i;
            edges[i][1] = i + 1;
            edges[i][2] = 2 << i;
        }
        for (int i = 0; i < length - 1; i++) {
            if ((L & (1 << i))!= 0) {
                edges[i][2] = L;
                L -= 1 << i;
            }
        }
        System.out.println(length + " " + edges.length);
        for (int[] edge : edges) {
            for (int i : edge) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```

'''
<|endoftext|>
