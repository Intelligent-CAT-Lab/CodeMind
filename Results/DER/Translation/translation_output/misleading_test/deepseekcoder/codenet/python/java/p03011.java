<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
-64

```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
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

        System.out.println(a + b + c - maxOfThree(a, b, c));
    }

    private static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
```

This Java code reads three integers from the standard input, calculates the sum of the three integers and the maximum of the three integers, and then prints the result of the subtraction. The `maxOfThree` method is used to find the maximum of three integers.
<|EOT|>
