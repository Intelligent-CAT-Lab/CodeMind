<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[][] edges = new int[length][3];

        for (int i = 1; i < length; i++) {
            edges[i][0] = i;
            edges[i][1] = i + 1;
            edges[i][2] = (int) Math.pow(2, i - 1);
            edges[i][0] = i;
            edges[i][1] = i + 1;
            edges[i][2] = 0;
        }

        for (int i = length - 1; i > 0; i--) {
            if ((L >> i) & 1 == 1) {
                L -= (int) Math.pow(2, i);
                edges[i + 1][0] = i + 1;
                edges[i + 1][1] = length;
                edges[i + 1][2] = L;
            }
        }

        System.out.println(length + " " + edges.length);
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}
```
This is a Java implementation of the Python code provided. The code first reads an integer `L` from the standard input using the `Scanner` class. It then calculates the length of the binary representation of `L` using the `Math.ceil()` and `Math.log()` methods.

The code then initializes a 2D array `edges` with the length of the binary representation of `L` and 3 columns. It then populates the array with the edges of the graph, where each edge is represented by a 3-element array containing the source node, the destination node, and the weight of the edge.

The code then iterates over the binary representation of `L` and for each 1-bit, it adds an edge to the graph with the source node being the current position and the destination node being the next position. The weight of the edge is set to 0.

Finally, the code prints the length of the binary representation of `L` and the number of edges in the graph, followed by the edges in the graph.

Note that the code uses the `Math.pow()` method to calculate the power of 2, and the `Math.log()` method to calculate the logarithm of a number.</s>
