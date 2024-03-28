<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        List<int[]> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i + 1, (int) Math.pow(2, i - 1)});
            edges.add(new int[]{i, i + 1, 0});
        }
        for (int i = 0; i < length - 1; i++) {
            if ((L & (1 << i)) != 0) {
                L -= (int) Math.pow(2, i);
                edges.add(new int[]{i + 1, length, L});
            }
        }
        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the number of edges and vertices, and then prints them out. The edges are stored in a list of arrays, where each array contains three integers: the source vertex, the destination vertex, and the weight of the edge.<｜end▁of▁sentence｜>
