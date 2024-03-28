<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
gpg

Expected output:
0


```
s=input()
print(len(s)//2-s.count('p'))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println((s.length() / 2) - count);
    }
}
```

This Java code reads a string from the user, counts the number of 'p' characters in the string, and then calculates the difference between half the length of the string and the count of 'p' characters. The result is then printed to the console.<｜end▁of▁sentence｜>
