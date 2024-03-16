<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            if (n < 3) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n - 1; j++) {
                    int result = (i - ~(j ^ (n % 2 < (j + 2 < n) ? n : i * 2))) % n + 1;
                    sb.append(result).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, and then for each `i` in the range from `0` to `n - 2 / n`, it prints a line of space-separated integers. The integers are computed using a similar formula to the one in the Python code.

Please note that the `~` operator in Python is equivalent to the `~` operator in Java, but the `^` operator in Python is equivalent to the `^` operator in Java. The `<` operator in Python is equivalent to the `<` operator in Java, and the `>` operator in Python is equivalent to the `>` operator in Java. The `%` operator in Python is equivalent to the `%` operator in Java. The `+` operator in Python is equivalent to the `+` operator in Java. The `1` in the Python code is equivalent to the `1` in the Java code.
<|EOT|>
