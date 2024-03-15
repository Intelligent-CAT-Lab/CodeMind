<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input = sys.stdin.readline

n, k = [int(x) for x in input().split()]

n_k = n // k
n_mod_k = n % k

def mod_k(x):
    res = n_k
    if x != 0 and x <= n_mod_k:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        int n_k = n / k;
        int n_mod_k = n % k;

        int ans = 0;
        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (i + n_mod_k) % k;
            int c_mod = (i + 2 * n_mod_k) % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += mod_k(a_mod) * mod_k(b_mod) * mod_k(c_mod);
            }
        }
        System.out.println(ans);
    }

    public static int mod_k(int x) {
        int res = x / k;
        if (x != 0 && x <= k - 1) {
            res++;
        } else if (x == 0 && k - 1 == k) {
            res++;
        }
        return res;
    }
}
```</s>
