<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = "";
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

This Java code does the same thing as the Python code. It reads a string from the user, then checks if the string contains the sequence "CF". If it does, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
