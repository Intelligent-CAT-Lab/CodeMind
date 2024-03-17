<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
34


```
S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            a = Math.min(Math.abs(753 - Integer.parseInt(S.substring(i, i + 3))), a);
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates over the string, calculating the absolute difference between 753 and the three-digit number formed by the current character and the next two characters. It keeps track of the smallest difference found so far in the variable `a`. Finally, it prints the smallest difference.<｜end▁of▁sentence｜>
