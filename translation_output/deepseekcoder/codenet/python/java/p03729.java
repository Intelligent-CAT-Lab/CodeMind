<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c = input().split()

if a[-1] == b[0] and b[-1] == c[0]:
    print('YES')
else:
    print('NO')


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        if (input[0].charAt(input[0].length() - 1) == input[1].charAt(0) && input[1].charAt(input[1].length() - 1) == input[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, and then checks if the last character of the first string is the same as the first character of the second string, and the last character of the second string is the same as the first character of the third string. If both conditions are met, it prints "YES", otherwise it prints "NO".
<|EOT|>
