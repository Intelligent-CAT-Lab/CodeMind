System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
8


```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long mod = (long)Math.pow(10,9)+7;
        long result = power(m,n,mod);
        System.out.println(result);
    }

    public static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}
```

Test input:
2 3

Expected output:
8<|endoftext|>
