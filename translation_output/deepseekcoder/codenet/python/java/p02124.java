<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print("ai1333" + "3" * int(int(input()) / 100))

```

### Response:
Here is the Java equivalent of the Python code you provided:

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

This Java code does the same thing as your Python code. It reads an integer from the user, divides it by 100, and repeats the string "3" that many times. It then concatenates "ai1333" with the repeated string and prints the result.

Please note that the `repeat()` function is available from Java 11 onwards. If you are using an older version of Java, you can use a for loop to repeat the string:

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

This code does the same thing as the previous one, but uses a `StringBuilder` to build the repeated string.
<|EOT|>
