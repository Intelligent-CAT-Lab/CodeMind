<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n)%1000000007);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % 1000000007;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates its factorial modulo 1000000007, and prints the result. The factorial is calculated using a loop, and the result is updated in each iteration by multiplying the current number and taking the modulo 1000000007. This is done to prevent overflow and to meet the problem's requirement.
<|EOT|>
