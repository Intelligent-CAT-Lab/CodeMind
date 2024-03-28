<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 15 80

Expected output:
{N-

```
data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
    print('Yes')
else:
    print('No')
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((double)a/b <= c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads three integers from the standard input, and checks if the result of the division of the first by the second is less than or equal to the third. It then prints "Yes" if the condition is true, and "No" otherwise.

Please note that in Java, the division of two integers results in an integer, so we need to cast one of the operands to a double to get a floating-point result.
<|EOT|>
