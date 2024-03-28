<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
-21

```
# AOJ 1591 Graph Making
# Python3 2018.7.13 bal4u

n, d = map(int, input().split())
if d == 1: print(n*(n-1)//2)
else: print((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)//2))

```
[/INST]
```java
import java.util.Scanner;

public class GraphMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d;
        n = sc.nextInt();
        d = sc.nextInt();
        int result = 0;
        if (d == 1) {
            result = (n * (n - 1)) / 2;
        } else {
            result = ((n - 1) + (n - d - 1) * n) - ((n - d - 1) * (n + d - 2) / 2);
        }
        System.out.println(result);
    }
}
```</s>
