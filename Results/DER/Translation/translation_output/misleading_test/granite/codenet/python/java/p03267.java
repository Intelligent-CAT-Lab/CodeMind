System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
3 4
1S 2 1
 2 0
2 3 2y
2k{Qe

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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int)Math.floor(Math.log(L) / Math.log(2)) + 1;
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            edges.add(Arrays.asList(i, i+1, 1 << (i-1)));
            edges.add(Arrays.asList(i, i+1, 0));
        }
        for (int i = 0; i < length-1; i++) {
            if ((L >> i & 1) == 1) {
                L -= 1 << i;
                edges.add(Arrays.asList(i+1, length, L));
            }
        }
        System.out.println(length + " " + edges.size());
        for (List<Integer> edge : edges) {
            for (int num : edge) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
