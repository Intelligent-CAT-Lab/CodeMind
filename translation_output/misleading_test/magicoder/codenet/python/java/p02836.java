<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
redcoder

Expected output:
91

```
s = input()

n = len(s)-1
ans = 0
for i in range(len(s)//2):
	if s[i] != s[n-i]:
		ans += 1

print(ans)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int n = s.length() - 1;
        int ans = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, calculates the number of characters that are different from their mirror image in the string, and then prints the result.<｜end▁of▁sentence｜>
