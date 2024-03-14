<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
print(len(s)//2-s.count('p'))
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = (int) s.chars().filter(ch -> ch == 'p').count();
        System.out.println(s.length() / 2 - count);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of 'p' characters in the string, and then prints the result of dividing the length of the string by 2 minus the count of 'p' characters.
<|EOT|>
