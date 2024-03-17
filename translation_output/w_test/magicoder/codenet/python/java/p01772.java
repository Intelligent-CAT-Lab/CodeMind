<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIZUNYANPEROPERO

Expected output:
AZ


```
s = input()
ans = ""
flag = False
for c in s:
  if c == "A" and not flag:flag = True
  if c == "Z" and flag:
    ans += "AZ"
    flag = False
if ans == "":
  print(-1)
else:
  print(ans)

```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' && !flag) {
                flag = true;
            }
            if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates over each character in the string. If it encounters an 'A' and the flag is not set, it sets the flag to true. If it encounters a 'Z' and the flag is set, it appends "AZ" to the answer string and resets the flag. If no "AZ" sequences were found, it prints -1; otherwise, it prints the answer string.<｜end▁of▁sentence｜>
