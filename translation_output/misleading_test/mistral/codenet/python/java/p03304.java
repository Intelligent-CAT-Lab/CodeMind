<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-95.59809439141243

```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, d;
        n = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
        if (d > 0) {
            System.out.println(2 * (n - d) * (m - 1) / Math.pow(n, 2));
        } else {
            System.out.println((m - 1) / n);
        }
    }
}
```</s>
