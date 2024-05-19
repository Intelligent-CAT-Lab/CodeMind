System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 4

Expected output:
92

```
n, k = map(int, input().split())

rot = n//k
x = n

if k == 1 or n == k or n%k == 0:
  x = 0
elif rot >= 1:
  x = n - k*rot
  
t = x%k

print(min(t, abs(t-k)))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rot = n/k;
        int x = n;
        if (k == 1 || n == k || n%k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k*rot;
        }
        int t = x%k;
        System.out.println(Math.min(t, Math.abs(t-k)));
    }
}
```

Test input:
```
7 4
```

Expected output:
```
92
```<|endoftext|>
