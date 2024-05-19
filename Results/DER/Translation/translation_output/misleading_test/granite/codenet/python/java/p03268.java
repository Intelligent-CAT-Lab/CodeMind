System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
7

```
import sys
input = sys.stdin.readline

n, k = [int(x) for x in input().split()]

n_k = n // k
n_mod_k = n % k

def mod_k(x):
    res = n_k
    if x!= 0 and x <= n_mod_k:
        res += 1
    elif x == 0 and n_mod_k == k:
        res += 1
    return res

ans = 0

for i in range(k):
    a_mod = i
    b_mod = -i % k
    c_mod = -i % k
    if (b_mod +c_mod) % k == 0:
        ans += mod_k(a_mod) * mod_k(b_mod) * mod_k(c_mod)

print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int n_k = n / k;
        int n_mod_k = n % k;

        int ans = 0;
        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (-i) % k;
            int c_mod = (-i) % k;
            if ((b_mod + c_mod) % k == 0) {
                int count = 1;
                if (a_mod!= 0 && a_mod <= n_mod_k) {
                    count *= (n_k + 1);
                } else if (a_mod == 0 && n_mod_k == k) {
                    count *= (n_k + 1);
                }
                if (b_mod!= 0 && b_mod <= n_mod_k) {
                    count *= (n_k + 1);
                } else if (b_mod == 0 && n_mod_k == k) {
                    count *= (n_k + 1);
                }
                if (c_mod!= 0 && c_mod <= n_mod_k) {
                    count *= (n_k + 1);
                } else if (c_mod == 0 && n_mod_k == k) {
                    count *= (n_k + 1);
                }
                ans += count;
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
