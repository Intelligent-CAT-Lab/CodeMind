<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = (s.contains(" A ") && s.contains(" B ")) ? " Yes " : " No ";
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, checks if the string contains both " A " and " B ", and prints " Yes " if it does, " No " otherwise.
<|EOT|>
