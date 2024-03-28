<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
77

```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = 1000000007;
        System.out.println(pow(m,n,mod));
    }
    public static int pow(int m, int n, int mod) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            int temp = pow(m, n / 2, mod);
            return (temp * temp) % mod;
        } else {
            return (m * pow(m, n - 1, mod)) % mod;
        }
    }
}
```

'''
<|endoftext|>
