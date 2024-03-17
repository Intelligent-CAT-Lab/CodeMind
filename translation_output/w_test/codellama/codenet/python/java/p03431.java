<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 998244353;
        int[] f = new int[k + 1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (-~i * f[i - 1]) % p;
        }
        int sum = 0;
        for (int i = n - 1; i >= k; i--) {
            sum = (sum + f[i] * f[-2 - i] % p) % p;
        }
        System.out.println(sum);
    }
}
```
This code uses the same approach as the Python code, but it is written in Java. It first reads in the input `n` and `k` from the user, and then it initializes an array `f` of size `k + 1` with the value `1`. It then calculates the values of `f[i]` for `i` from `1` to `k` using the formula `f[i] = (-~i * f[i - 1]) % p`, where `p` is a large prime number.

After that, it calculates the sum of the values of `f[i] * f[-2 - i] % p` for `i` from `n - 1` to `k`, and prints the result.

Note that the `%` operator in Java is used to calculate the remainder of a division, so `a % b` is the remainder of `a` divided by `b`.</s>
