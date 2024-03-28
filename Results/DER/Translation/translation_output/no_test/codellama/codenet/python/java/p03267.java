<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[] edges = new int[length * 2];
        for (int i = 1; i < length; i++) {
            edges[i * 2 - 1] = i;
            edges[i * 2] = i + 1;
            edges[i * 2 - 1] = 2 ** (i - 1);
            edges[i * 2] = 0;
        }
        for (int i = length - 1; i > 0; i--) {
            if (L >> i & 1) {
                L -= 2 ** i;
                edges[i * 2 - 1] = i + 1;
                edges[i * 2] = length;
                edges[i * 2 - 1] = L;
            }
        }
        System.out.println(length + " " + edges.length);
        for (int i = 0; i < edges.length; i++) {
            System.out.println(edges[i]);
        }
    }
}
```
This is the Java code equivalent to the Python code. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The code first reads the input `L` and calculates the length of the binary representation of `L` using `Math.ceil(Math.log(L) / Math.log(2))`. It then initializes an array `edges` of size `length * 2` to store the edges of the graph.

The code then iterates over the binary representation of `L` and for each 1-bit, it adds two edges to the graph: one from the current position to the next position, and the other from the current position to the next position with a weight of 0.

Finally, the code prints the length of the graph and the number of edges, followed by the edges of the graph.</s>
