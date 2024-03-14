<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print(input().count('1'))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        long count = input.chars().filter(ch -> ch == '1').count();
        System.out.println(count);
    }
}
```

This Java code reads a line of input from the user, counts the number of '1' characters in the input, and prints the count. The `chars()` method is used to convert the input string into a stream of characters, the `filter()` method is used to filter out the characters that are not '1', and the `count()` method is used to count the number of '1' characters.
<|EOT|>
