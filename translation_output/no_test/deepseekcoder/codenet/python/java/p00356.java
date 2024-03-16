<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b - gcd(a, b) + 1);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input. The `gcd` method is a standard method to calculate the greatest common divisor of two numbers using the Euclidean algorithm. The `main` method reads two integers from the input, calculates their sum and difference, subtracts the greatest common divisor and adds 1 to the result. The result is then printed to the standard output.
<|EOT|>
