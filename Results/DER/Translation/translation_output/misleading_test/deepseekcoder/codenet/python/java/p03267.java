<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        List<Edge> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new Edge(i, i+1, (int)Math.pow(2, i-1)));
            edges.add(new Edge(i, i+1, 0));
        }
        for (int i = 0; i < length-1; i++) {
            if ((L & (1 << i)) != 0) {
                L -= (int)Math.pow(2, i);
                edges.add(new Edge(i+1, length, L));
            }
        }
        System.out.println(length + " " + edges.size());
        for (Edge edge : edges) {
            System.out.println(edge.from + " " + edge.to + " " + edge.weight);
        }
    }
}

class Edge {
    int from;
    int to;
    int weight;

    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, generates a list of edges based on the integer, and then prints the number of edges and the details of each edge. The `Edge` class is used to represent each edge.
<|EOT|>
