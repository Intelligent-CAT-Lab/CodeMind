<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2


```
x=int(input())

ans=0
q,r=divmod(x,11)
ans+=2*q
q,r=divmod(r,6)
ans+=q
if r>0:
  ans+=1
print(ans)

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 0;
        int[] qr = divmod(x, 11);
        ans += 2 * qr[0];
        qr = divmod(qr[1], 6);
        ans += qr[0];
        if (qr[1] > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }

    private static int[] divmod(int x, int y) {
        int q = x / y;
        int r = x % y;
        return new int[]{q, r};
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, calculates the number of 11s and 6s in the number, and prints the result. The `divmod` function is used to calculate quotient and remainder in the same line.
<|EOT|>
