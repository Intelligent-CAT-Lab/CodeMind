<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
import math
x = int(input())
k = 0
t = 0

if (math.sqrt(8 * x + 1) == math.floor(math.sqrt(8 * x + 1))):
  a = (-1 + math.sqrt(1 + 8 * x))/2
  print(int(a))
else:
  x = (-1 + math.sqrt(1 + 8 * x))//2
  print(int(x) + 1)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        double sqrtVal = 8 * x + 1;
        if (Math.floor(sqrtVal) == sqrtVal) {
            double a = (-1 + Math.sqrt(sqrtVal)) / 2;
            System.out.println((int) a);
        } else {
            double b = (-1 + Math.sqrt(sqrtVal)) / 2;
            System.out.println((int) b + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the square root of `8 * x + 1`, and then prints the result. If the square root is a whole number, it prints the integer part of `(-1 + sqrt(8 * x + 1)) / 2`. Otherwise, it prints the integer part of `(-1 + sqrt(8 * x + 1)) / 2` plus one.
<|EOT|>
