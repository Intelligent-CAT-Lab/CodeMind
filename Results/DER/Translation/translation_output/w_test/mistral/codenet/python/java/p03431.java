<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        long p = 998244353;
        List<Integer> f = new ArrayList<>();
        f.add(1);
        for (int i = 1; i <= k; i++) {
            f.add(-(~i * f.get(i) % p));
        }
        long ans = 0;
        for (int i = 1; i <= n - 1; i++) {
            ans += (f.get(i) * f.get(i + k) * f.get(i + k - 1) * f.get(i + k - 2)) % p;
        }
        System.out.println(ans % p);
    }
}
```</s>
