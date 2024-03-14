<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        System.out.println(a * b);
        System.out.println((a + b) * 2);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the product of these integers and the double sum of these integers, and prints these values.
<|EOT|>
