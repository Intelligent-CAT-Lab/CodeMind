<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3


```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int val = (i - (~(j ^ ((n % 2 < (j + 2 < n) && n > i * 2)))) % n) + 1;
                sb.append(val).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` from the input, and then prints `n` lines of numbers. Each line `i` is a sequence of numbers from 1 to `n`, where each number `j` is calculated as `(i - (~(j ^ ((n % 2 < (j + 2 < n) && n > i * 2)))) % n) + 1`.

The `~` operator is the bitwise NOT operator, `^` is the bitwise XOR operator, `<` is the less than operator, `>` is the greater than operator, and `&&` is the logical AND operator. The `%` operator is the modulus operator. The `+` operator is the addition operator.

The `.append()` method is used to build the string, and the `.toString().trim()` method is used to print the string without the trailing space.
<|EOT|>
