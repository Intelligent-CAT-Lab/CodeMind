System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
54

```
# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```


Answer:
```java
import java.util.*;

public class Main {
    static long MOD = (long)Math.pow(10,9)+7;
    public static long P(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
    public static long C(int n, int r) {
        return P(n, r) / factorial(r);
    }
    public static long H(int n, int r) {
        return C(n + r - 1, r);
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long result = 0;
        if (n < k) {
            result = 0;
        } else if (n > k) {
            result = C(k, n) % MOD;
        } else {
            result = 1;
        }
        System.out.println(result);
    }
}
```

Test input:
```
3 5
```

Expected output:
```
54
```<|endoftext|>
