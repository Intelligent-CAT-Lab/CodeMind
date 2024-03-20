Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(power(m, n, mod));
    }

    public static int power(int m, int n, int mod) {
        if (n == 0) {
            return 1;
        }
        int res = power(m, n / 2, mod);
        res = (res * res) % mod;
        if (n % 2 == 1) {
            res = (res * m) % mod;
        }
        return res;
    }
}
```<|endoftext|>
