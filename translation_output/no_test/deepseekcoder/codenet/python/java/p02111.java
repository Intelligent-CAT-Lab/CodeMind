<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print(*divmod(int(input())*2,60))

```

### Response:
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] result = divmod(input * 2, 60);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] divmod(int a, int b) {
        int[] result = new int[2];
        result[0] = a / b;
        result[1] = a % b;
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, multiplies it by 2, and then divides by 60 using the `divmod` function. The result is printed to the standard output.
<|EOT|>
