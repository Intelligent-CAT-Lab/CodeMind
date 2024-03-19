<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIZU

Expected output:
-9

```
S = input()

alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
Now = 0
ans = 0
for s in S:
    Next = alpha.find(s)
    # print(s, Now, Next)

    if(Now < Next):
        pass
    else:
        ans += 1
    Now = Next
print(ans)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int next = alpha.indexOf(s);
            if (now < next) {
                now = next;
            } else {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then iterates over each character in the string. For each character, it finds its position in the alphabet string and compares it to the position of the previous character. If the current character is not alphabetically after the previous one, it increments the answer. The final answer is the number of times the current character is not alphabetically after the previous one.
<|EOT|>
