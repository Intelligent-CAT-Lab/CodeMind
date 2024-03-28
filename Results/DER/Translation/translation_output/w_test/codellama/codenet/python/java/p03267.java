<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
This code first reads an integer `L` from the input, and then calculates the number of bits needed to represent `L` using `Math.ceil(Math.log(L) / Math.log(2))`. It then initializes an array `edges` of size `length` to store the edges of the graph.

The next step is to populate the `edges` array with the edges of the graph. For each edge, it sets the first two elements to the indices of the vertices, and the third element to the weight of the edge. The weight of the edge is calculated using the formula `2^(i-1)`, where `i` is the index of the edge.

The final step is to print the number of edges and the edges themselves. The number of edges is calculated using the length of the `edges` array, and the edges are printed using a for-each loop.

Note that this code assumes that the input integer `L` is non-negative. If `L` is negative, the code will throw an exception.</s>
