<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
119

Expected output:
999

```
moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.next();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            ans += (moji.charAt(i) == '1') ? '9' : '1';
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then iterates over each character in the string. If the character is '1', it appends '9' to the answer string. If the character is not '1', it appends '1' to the answer string. Finally, it prints the answer string.
<|EOT|>
