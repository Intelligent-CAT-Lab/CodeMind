<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5

Expected output:
5


```
a,b = map(int,input().rstrip().split())
if a>b:
    print(a-1)
else:
    print(a)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, compares them, and prints the larger one minus one if the first number is greater than the second one, otherwise it prints the first number.
<|EOT|>
