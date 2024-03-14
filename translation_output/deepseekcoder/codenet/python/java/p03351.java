<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(
            "YNeos".charAt(
                !(Math.abs(a-c) <= d || (Math.abs(a-b) <= d && Math.abs(b-c) <= d)) ? 0 : 2
            )
        );
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the input, and then checks if the conditions in the provided Python code are met. The result is printed as a single character string "YNeos", where the character at the index corresponding to the condition is printed.
<|EOT|>
