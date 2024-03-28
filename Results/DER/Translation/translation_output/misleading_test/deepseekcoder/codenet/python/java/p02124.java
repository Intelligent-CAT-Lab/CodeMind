<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
a{1383

```
print("ai1333" + "3" * int(int(input()) / 100))

```

### Response:
Here is the Java equivalent of the Python code:

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

This Java code reads an integer from the standard input, calculates the number of repetitions of the string "3" based on the input divided by 100, and then concatenates the string "ai1333" with the repeated "3"s. The result is then printed to the standard output.

Please note that the `repeat()` method is available from Java 11 onwards. If you are using an older version of Java, you can use a for loop to achieve the same result:

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
