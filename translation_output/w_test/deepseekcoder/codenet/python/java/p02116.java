<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
n = int(input())
print((n+1) &- (n+1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n+1) & -(n+1));
    }
}
```

This Java code reads an integer from the standard input, calculates ```(n+1) & -(n+1)``` and prints the result. The ```&``` operator in Java is the bitwise AND operator. The ```-``` operator in Java is the unary negation operator, which in this case is used to convert the number to its binary representation. The bitwise AND of a number and its negation will always give the least significant bit of the number.
<|EOT|>
