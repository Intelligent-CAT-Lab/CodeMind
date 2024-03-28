<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
akasaka

Expected output:
Yes


```
s = input()

div = len(s) // 2
pre = s[:div]
suf = s[div + 1:]

if s == s[::-1] and pre == pre[::-1] and suf == suf[::-1]:
    print('Yes')
else:
    print('No')

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        String reversed = new StringBuilder(s).reverse().toString();
        String reversedPre = new StringBuilder(pre).reverse().toString();
        String reversedSuf = new StringBuilder(suf).reverse().toString();

        if (s.equals(reversed) && pre.equals(reversedPre) && suf.equals(reversedSuf)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, divides it into two parts, and checks if the original string, the first part, and the second part are the same when reversed. If they are, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
