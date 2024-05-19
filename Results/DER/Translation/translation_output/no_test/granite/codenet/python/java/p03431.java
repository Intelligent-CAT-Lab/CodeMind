System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split());p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[-2]*pow(f[i]*f[-2-i],-1,p)for i in r(n-1,k))%p)
```


Answer:
Here's the Java code equivalent to the given Python code:
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
            f[i] = (-~i * f[i-1]) % p;
        }
        long ans = 0;
        for (int i = n-1; i < k; i++) {
            ans = (ans + f[i] * pow(f[i-n+2] * f[k-i] % p, p-2, p)) % p;
        }
        System.out.println(ans);
    }
    public static long pow(long a, long b, long p) {
        long res = 1;
        a %= p;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % p;
            }
            a = (a * a) % p;
            b >>= 1;
        }
        return res;
    }
}
```

In this Java code, we first read the values of `n` and `k` from the user using a `Scanner` object. We then define the prime number `p` and create an array `f` to store the factorial values. We initialize `f[0]` to 1 and then calculate the factorial values for `i` ranging from 1 to `k` using the formula `f[i] = (-~i * f[i-1]) % p`.

Next, we initialize a variable `ans` to store the final answer. We then iterate over the range `i` from `n-1` to `k` and calculate the contribution of each term to the final answer using the formula `ans = (ans + f[i] * pow(f[i-n+2] * f[k-i] % p, p-2, p)) % p`.

Finally, we print the value of `ans` as the final answer. The `pow` function is a helper function that calculates the modular exponentiation of a number `a` raised to the power of `b` modulo `p`.<|endoftext|>
