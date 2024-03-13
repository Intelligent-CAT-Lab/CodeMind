<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int n_k = n / k;
        int n_mod_k = n % k;

        long ans = 0;

        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = -i % k;
            int c_mod = -i % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += mod_k(a_mod, n_k, n_mod_k) * mod_k(b_mod, n_k, n_mod_k) * mod_k(c_mod, n_k, n_mod_k);
            }
        }

        System.out.println(ans);
    }

    private static long mod_k(int x, int n_k, int n_mod_k) {
        long res = n_k;
        if (x != 0 && x <= n_mod_k) {
            res += 1;
        } else if (x == 0 && n_mod_k == k) {
            res += 1;
        }
        return res;
    }
}
```

Please note that in Java, the ```//``` operator performs integer division, so we need to use ```/``` for floating point division. Also, the ```%``` operator in Java returns the remainder of the division, not the modulus. Therefore, we need to use ```%``` for the modulus operation.<｜end▁of▁sentence｜>
