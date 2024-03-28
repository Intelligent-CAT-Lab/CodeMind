<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
4


```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b + c - maxOfThree(a, b, c));
    }

    private static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the sum of the three integers and subtracts the maximum of the three integers. The result is then printed to the console. The `maxOfThree` method is used to find the maximum of three integers.
<|EOT|>
