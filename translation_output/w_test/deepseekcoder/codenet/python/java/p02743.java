<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 9

Expected output:
No


```
a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println((4 * a * b < Math.pow(c - a - b, 2)) ? "Yes" : "No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, checks if the third integer is greater than or equal to the sum of the first two, and then prints "Yes" if 4 times the product of the first two integers is less than the square of the difference of the third and the sum of the first two, and "No" otherwise.
<|EOT|>
