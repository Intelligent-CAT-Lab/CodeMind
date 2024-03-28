<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int)Math.ceil(k/2) * (k/2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, divides it by 2, rounds up to the nearest integer using `Math.ceil()`, and then multiplies the result by the integer division of `k` by 2. The result is printed to the console.
<|EOT|>
