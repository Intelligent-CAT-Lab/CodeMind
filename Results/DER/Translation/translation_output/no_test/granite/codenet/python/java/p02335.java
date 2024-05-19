System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
import java.io.*;

class Main {
    static long MOD = (long)Math.pow(10,9)+7;
    static long factorial(long n){
        long res = 1;
        for(long i = 2; i <= n; i++){
            res *= i;
            res %= MOD;
        }
        return res;
    }
    static long P(long n, long r){
        return factorial(n) * modinv(factorial(n-r), MOD) % MOD;
    }
    static long C(long n, long r){
        return P(n,r) * modinv(factorial(r), MOD) % MOD;
    }
    static long H(long n, long r){
        return C(n+r-1,r);
    }
    static long modinv(long a, long m){
        long b = m, u = 1, v = 0;
        while(b > 0){
            long t = a / b;
            a -= t * b;
            long x = a;
            a = b;
            b = x;
            x = u;
            u = v;
            v = x - t * v;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long n = Long.parseLong(input[0]);
        long k = Long.parseLong(input[1]);
        System.out.println(C(k,n)%MOD);
    }
}
```<|endoftext|>
