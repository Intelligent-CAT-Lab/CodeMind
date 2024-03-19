<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
69

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
        if (Math.sqrt(sqrtVal) == Math.floor(Math.sqrt(sqrtVal))) {
            double a = (-1 + Math.sqrt(sqrtVal)) / 2;
            System.out.println((int) a);
        } else {
            x = (int) (-1 + Math.sqrt(sqrtVal)) / 2;
            System.out.println(x + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates a value based on it, and then prints the result. The only difference is that Java uses `Math.sqrt()` and `Math.floor()` instead of `math.sqrt()` and `math.floor()`. Also, Java uses `Scanner` to read the input instead of `input()`. The `int()` function in Python is replaced by casting to `int` in Java.
<|EOT|>
