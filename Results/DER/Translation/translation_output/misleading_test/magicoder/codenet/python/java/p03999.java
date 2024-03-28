<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
234

```

s = input()

ans = 0
for i in range(2 ** (len(s) - 1)):
    pat = s[0]
    index = 1
    for j in range(len(s) - 1):
        if i >> j & 1:
            pat += "+"
        pat += s[index]
        index += 1
    #print(pat)
    ans += eval(pat)

print(ans)
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < Math.pow(2, len - 1); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < len - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.substring(index, index + 1);
                index += 1;
            }
            ans += Integer.parseInt(pat);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string of digits from the user, then generates all possible combinations of adding plus signs between the digits, evaluates each combination as an integer, and adds up all the results. The result is then printed to the console.<｜end▁of▁sentence｜>
