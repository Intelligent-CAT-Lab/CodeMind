<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
l = int(input())

d = max([d for d in range(30) if 2**d <= l])
n = d+1
m = 2*d
ans = []
for i in range(1, n):
    ans.append((i, i+1, 0))
    ans.append((i, i+1, 2**(i-1)))

while l > 2**d:
    for i in range(n-1, 0, -1):
        if l-2**(i-1) > 2**d-1:
            ans.append((i, n, l-2**(i-1)))
            m += 1
            l -= 2**(i-1)
            break

print(n, m)
for a in ans:
    print(*a)
```

@@ Response
```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = 0;
        for (int i = 0; i < 30; i++) {
            if ((int)Math.pow(2, i) <= l) {
                d = i;
            }
        }
        int n = d + 1;
        int m = 2 * d;
        ArrayList<int[]> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, (int)Math.pow(2, i - 1)});
        }

        while (l > (int)Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - (int)Math.pow(2, i - 1) > (int)Math.pow(2, d) - 1) {
                    ans.add(new int[]{i, n, l - (int)Math.pow(2, i - 1)});
                    m += 1;
                    l -= (int)Math.pow(2, i - 1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the maximum power of 2 that is less than or equal to the input, and then generates a list of edges and weights for a graph. The graph is a tree where each edge has weight 2^(i-1) for i from 1 to n-1, and the weight of the edge from i to i+1 is 0. Then, it adds edges to the graph until the input is less than or equal to 2^d. The number of nodes and edges in the graph are printed, and then the edges and weights are printed.<｜end▁of▁sentence｜>
