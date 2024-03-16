<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String C = scanner.next();
        String al = "abcdefghijklmnopqrstuvwxyz";
        int idx = al.indexOf(C);
        if (idx != -1) {
            System.out.println(al.charAt(idx + 1));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a character from the input, finds its index in the string `al`, and then prints the character that follows it in the string `al`. If the input character is not found in `al`, it does nothing.
<|EOT|>
