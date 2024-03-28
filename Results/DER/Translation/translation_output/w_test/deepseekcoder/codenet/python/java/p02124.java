<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


```
print("ai1333" + "3" * int(int(input()) / 100))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "ai1333" + "3".repeat(input / 100);
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, divides it by 100, and uses the result to repeat the string "3". The result is then concatenated with the string "ai1333" and printed to the standard output.

Please note that the `repeat()` function is available from Java 11 onwards. If you are using an older version of Java, you can use a loop to repeat the string:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        StringBuilder output = new StringBuilder("ai1333");
        for (int i = 0; i < input / 100; i++) {
            output.append("3");
        }
        System.out.println(output.toString());
    }
}
```
<|EOT|>
