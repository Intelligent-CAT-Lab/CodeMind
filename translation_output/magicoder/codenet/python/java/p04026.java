<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
for i in range(len(s)-1):
    if s[i]==s[i+1]:
        print(i+1,i+2)
        exit()
for i in range(len(s)-2):
    if s[i]==s[i+2]:
        print(i+1,i+3)
        exit()
print(-1,-1)
```

@@ Response
Here is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println((i + 1) + " " + (i + 2));
                System.exit(0);
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println((i + 1) + " " + (i + 3));
                System.exit(0);
            }
        }
        System.out.println(-1 + " " + -1);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then checks for two consecutive or three consecutive identical characters in the string. If it finds any, it prints the positions of the first and second identical characters and then exits. If it doesn't find any, it prints -1 -1.<｜end▁of▁sentence｜>
