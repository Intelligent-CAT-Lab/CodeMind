<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        List<int[]> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i+1, 1 << (i-1)});
            edges.add(new int[]{i, i+1, 0});
        }
        for (int i = 0; i < length-1; i++) {
            if ((L & (1 << i)) != 0) {
                L -= 1 << i;
                edges.add(new int[]{i+1, length, L});
            }
        }
        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `L` from the standard input, generates a list of edges based on `L`, and then prints the number of edges and each edge. The edge format is `(from, to, weight)`. The weight is calculated based on the bit representation of `L`.
<|EOT|>
