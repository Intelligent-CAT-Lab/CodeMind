<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
16

```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a*b);
        System.out.println((a+b)*2);
    }
}
```

This Java code reads two integers from the standard input, calculates their product and their sum, and prints the results. The first line prints the product of the two numbers, and the second line prints the double of the sum of the two numbers.
<|EOT|>
