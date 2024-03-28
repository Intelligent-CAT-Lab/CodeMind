<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-77

```
n,k = map(int, input().split())
if k > n:
    print(0)
    quit()
ans = 1
for i in range(1,k):
    ans *= n-i
    ans //= i
ans %= 1000000007
print(ans)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (k > n) {
            System.out.println(0);
            System.exit(0);
        }

        long ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= n - i;
            ans /= i;
            ans %= 1000000007;
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if `k` is greater than `n`, and if so, prints `0` and exits. If not, it calculates the result using a loop and prints the result.<｜end▁of▁sentence｜>
