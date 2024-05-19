System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
65

```
N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int t = 1;
        int a = 1;
        int n = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) {
                break;
            }
            t += 1;
        }
        System.out.println(t);
    }
}
```

Test input:
4 2

Expected output:
65<|endoftext|>
