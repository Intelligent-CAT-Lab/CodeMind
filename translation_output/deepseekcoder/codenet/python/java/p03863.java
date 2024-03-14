<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
if (s[0]==s[-1] and len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
 print("First")
else:
 print("Second")
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) ||
            (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if the first and last characters are the same and if the length of the string is even, or if the first and last characters are different and the length of the string is odd, and then prints "First" if the condition is met, otherwise it prints "Second".
<|EOT|>
