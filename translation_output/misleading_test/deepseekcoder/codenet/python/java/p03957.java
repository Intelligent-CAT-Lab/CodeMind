<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
YKs

```
s = input()
ss = ""
p = 0
for i in range(len(s)):
    if p == 0 and s[i] == "C":
        p = 1
    elif p == 1 and s[i] == "F":
        p = 2
print("Yes" if p == 2 else "No")
```

### Response:
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println(p == 2 ? "Yes" : "No");
    }
}
```

This Java code reads a string from the input, then checks if the string contains the sequence "CF". If it does, it prints "Yes", otherwise it prints "No".
<|EOT|>
