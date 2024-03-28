<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
16

Expected output:
poA

```
n=int(input())%10
if n==3:
    print("bon")
elif n in [2,4,5,7,9]:
    print("hon")
else:
    print("pon")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        if (n == 3) {
            System.out.println("bon");
        } else if (n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, gets the last digit by taking the remainder of the division by 10, and then checks if the last digit is 3, 2, 4, 5, 7, or 9. Depending on the result, it prints "bon", "hon", or "pon" to the output.
<|EOT|>
