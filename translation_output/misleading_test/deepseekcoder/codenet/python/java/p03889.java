<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pdbq

Expected output:
cU~

```
s = list(input())
t = s[::-1]
for i in range(len(t)):
  if t[i] == "p":
    t[i] = "q"
  elif t[i] == "q":
    t[i] = "p"
  if t[i] == "b":
    t[i] = "d"
  elif t[i] == "d":
    t[i] = "b" 
if s == t:
  ans = "Yes"
else:
  ans = "No"
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
        String t = new StringBuilder(s).reverse().toString();
        char[] chars = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'p') {
                chars[i] = 'q';
            } else if (chars[i] == 'q') {
                chars[i] = 'p';
            }
            if (chars[i] == 'b') {
                chars[i] = 'd';
            } else if (chars[i] == 'd') {
                chars[i] = 'b';
            }
        }
        String ans = new String(chars);
        if (s.equals(ans)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, reverses it, and then replaces 'p' with 'q' and 'q' with 'p', and 'b' with 'd' and 'd' with 'b'. It then checks if the reversed string is the same as the original string. If they are the same, it prints "Yes", otherwise it prints "No".
<|EOT|>
