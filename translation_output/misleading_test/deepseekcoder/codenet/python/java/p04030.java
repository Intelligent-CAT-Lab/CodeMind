<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
01B0

Expected output:
-11

```
s = input()
a = ""
for i in s:
  if i == "B":
    if not(a == ""):
      a = a[:-1]
  else:
    a += i
print(a)
```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'B') {
                if (a.length() > 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(c);
            }
        }
        System.out.println(a);
    }
}
```

This Java code reads a string from the standard input, and then processes it character by character. If it encounters a 'B', it removes the last character from the string builder. If it encounters any other character, it appends it to the string builder. Finally, it prints the resulting string.
<|EOT|>
