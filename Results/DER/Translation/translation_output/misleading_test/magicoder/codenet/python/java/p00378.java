<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
180 100 2400

Expected output:
491

```
A, B, X = map(int, input().split())
k = (X // 1000)
ans = k * min(A, 2*B)
r = X - 1000*k
if 0 < r <= 500:
    ans += min(A, B)
elif 500 < r:
    ans += min(A, 2*B)
print(ans)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        int k = X / 1000;
        int ans = k * Math.min(A, 2 * B);
        int r = X - 1000 * k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (r > 500) {
            ans += Math.min(A, 2 * B);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the minimum cost, and prints the result. The ```Math.min()``` function is used to find the minimum of two numbers. The ```//``` operator is used for integer division. The ```%``` operator is used for modulo operation. The ```&&``` operator is used for logical AND operation. The ```||``` operator is used for logical OR operation. The ```scanner.nextInt()``` function is used to read an integer from the standard input. The ```scanner.close()``` function is used to close the scanner.<｜end▁of▁sentence｜>
