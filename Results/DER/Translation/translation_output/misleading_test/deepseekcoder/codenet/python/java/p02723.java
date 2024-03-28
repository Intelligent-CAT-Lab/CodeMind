<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
sippuu

Expected output:
Ys

```
s = input()
if s[2] == s[3] and s[4] == s[5]:
    print("Yes")
else:
    print("No")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads a string from the standard input, and then checks if the 3rd and 4th characters of the string are the same as the 5th and 6th characters. If they are, it prints "Yes"; otherwise, it prints "No".
<|EOT|>
