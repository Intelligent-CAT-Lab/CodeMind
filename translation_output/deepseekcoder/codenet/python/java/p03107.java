<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        int N = A.length();

        int C0 = 0;
        int C1 = 0;

        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '0') {
                C0++;
            } else if (A.charAt(i) == '1') {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the number of '0's and '1's in the string, and then prints the minimum of the two counts multiplied by 2.
<|EOT|>
