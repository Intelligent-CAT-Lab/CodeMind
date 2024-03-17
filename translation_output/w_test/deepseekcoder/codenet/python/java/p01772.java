<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ans = "";
        boolean flag = false;
        for (char c : s.toCharArray()) {
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

This Java code does the same thing as the Python code. It reads a string from the input, then checks each character in the string. If it finds an 'A' and the flag is not set, it sets the flag to true. If it finds a 'Z' and the flag is set, it appends "AZ" to the answer string and resets the flag. Finally, it prints the answer string or -1 if the string is empty.
<|EOT|>
