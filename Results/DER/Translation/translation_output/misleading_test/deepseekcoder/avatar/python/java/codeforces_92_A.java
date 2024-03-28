<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
24 7440

Expected output:
71

```
import sys
input = sys . stdin . readline
n , m = map ( int , input ( ) . split ( ) )
i = 0
while True :
    if i + 1 > m :
        ans = m
        break
    m -= i + 1
    i += 1
    i %= n
print ( ans )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int ans = 0;
        while (true) {
            if (i + 1 > m) {
                ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, initializes `i` to 0 and `ans` to 0, and then enters a loop where it subtracts `i + 1` from `m` and increments `i` by 1. If `i + 1` is greater than `m`, it sets `ans` to `m` and breaks the loop. Otherwise, it takes the modulus of `i` by `n` and continues the loop. The final value of `ans` is then printed to the standard output.
<|EOT|>
