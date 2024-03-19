<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 6

Expected output:
-5

```
n, a, b = map(int,input().split())

if n >= 2:
    if b >= a:
        print((n-2)*(b-a)+1)
    else:
        print(0)
else:
    if a == b:
        print(1)
    else:
        print(0)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n >= 2) {
            if (b >= a) {
                System.out.println((n-2)*(b-a)+1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, and then checks if the first integer is greater than or equal to 2. If it is, it checks if the second integer is greater than or equal to the first integer. If it is, it prints the result of the expression `(n-2)*(b-a)+1`. If the second integer is not greater than or equal to the first integer, it prints 0. If the first integer is less than 2, it checks if the first and second integers are equal. If they are, it prints 1. If they are not, it prints 0.
<|EOT|>
