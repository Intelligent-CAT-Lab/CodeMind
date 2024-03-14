<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int now = 0;
        int ans = 0;
        for (char s : S.toCharArray()) {
            int next = alpha.indexOf(s);
            // System.out.println(s + " " + now + " " + next);

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

This Java code does the same thing as your Python code. It reads a string from the input, then iterates over each character in the string. For each character, it finds its position in the string `alpha` and compares it to the position of the previous character. If the current character's position is greater than or equal to the previous one, it increments `ans`. The final value of `ans` is then printed to the console.
<|EOT|>
