System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 4

Expected output:
7


```
n,k=map(int,input().split());p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[-2]*pow(f[i]*f[-2-i],-1,p)for i in r(n-1,k))%p)
```


Answer:
Here's the Java code for the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 998244353;
        long[] f = new long[k+1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (-~i) * f[i-1] % p;
        }
        long ans = 0;
        for (int i = n-1; i < k; i++) {
            ans += f[i] * pow(f[i-n+2] * f[k-i] % p, p-2, p) % p;
            ans %= p;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long p) {
        long res = 1;
        a %= p;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % p;
            }
            a = a * a % p;
            b >>= 1;
        }
        return res;
    }
}
```

You can test the code with the following test case:

```
2 4
```

Expected Output:
```
7
```<|endoftext|>
