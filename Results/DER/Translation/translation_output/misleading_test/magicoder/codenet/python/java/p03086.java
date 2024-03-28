<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ATCODER

Expected output:
62

```
# é¨åæå­åã®ãã¡ãacgtã®ã¿ãããªããã®ã®æå¤§é·
# åé ­ããæ¢ç´¢ãã¦ãacgtãªãé·ãã+1ãã
ans = 0
length = 0
s = input()
for i in s:
  if i in ["A","C","G","T"]:
    length += 1
    ans = max(ans,length)
  else:
    length = 0
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
        int ans = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length += 1;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, then iterates over each character in the string. If the character is 'A', 'C', 'G', or 'T', it increments the length and updates the answer if the new length is greater. If the character is not 'A', 'C', 'G', or 'T', it resets the length to 0. Finally, it prints the answer.<｜end▁of▁sentence｜>
