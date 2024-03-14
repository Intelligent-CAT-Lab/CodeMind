<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int[] divmodResult = divmod(x, 11);
        ans += 2 * divmodResult[0];
        divmodResult = divmod(divmodResult[1], 6);
        ans += divmodResult[0];
        if (divmodResult[1] > 0) {
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

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the answer, and prints it. The `divmod` function is replaced with a custom method that returns an array of two integers: the quotient and the remainder of the division.
<|EOT|>
