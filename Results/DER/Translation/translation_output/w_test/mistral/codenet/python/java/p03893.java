<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
g = [None]*50
h = [None]*50
h[1] = 3
g[1] = 6
X= int(input())
for i in range(2, X+1):
    h[i] = g[i-1] + 1
    g[i] = 2*h[i]
print(g[X])

```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int[] g = new int[50];
        int[] h = new int[50];
        h[1] = 3;
        g[1] = 6;
        int X = Integer.parseInt(args[0]);
        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }
        System.out.println(g[X]);
    }
}
```</s>
