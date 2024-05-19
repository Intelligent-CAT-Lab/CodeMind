System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        double result;
        if (d > 0) {
            result = 2.0 * (n - d) * (m - 1) / Math.pow(n, 2);
        } else {
            result = (m - 1) / (double) n;
        }
        System.out.println(result);
    }
}
```

Test input:
```
2 3 1
```

Expected output:
```
-95.59809439141243
```<|endoftext|>
