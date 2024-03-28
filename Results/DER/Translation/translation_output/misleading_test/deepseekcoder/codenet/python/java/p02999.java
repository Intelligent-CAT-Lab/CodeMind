<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
-70

```
a,b=map(int,input().split())
print(0 if a<b else 10)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(a < b ? 0 : 10);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then prints `0` if the first integer is less than the second, otherwise it prints `10`.
<|EOT|>
