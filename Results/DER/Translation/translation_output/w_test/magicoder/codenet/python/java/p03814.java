<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
QWERTYASDFZXCV

Expected output:
5


```
s = input()
a_index = 0
z_index = 0
for i in range(len(s)):
    if s[i] == 'A':
        a_index = i
        break
for i in range(len(s) - 1, 0, -1):
    if s[i] == 'Z':
        z_index = i
        break
print(z_index - a_index + 1)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int aIndex = 0;
        int zIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aIndex = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                zIndex = i;
                break;
            }
        }
        System.out.println(zIndex - aIndex + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, finds the index of the first 'A' and the last 'Z', and then prints the number of characters between these two indices, including the characters at the indices themselves.<｜end▁of▁sentence｜>
