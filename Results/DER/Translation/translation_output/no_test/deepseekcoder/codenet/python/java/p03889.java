<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = new StringBuilder(s).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'p') {
                result.append('q');
            } else if (c == 'q') {
                result.append('p');
            } else if (c == 'b') {
                result.append('d');
            } else if (c == 'd') {
                result.append('b');
            } else {
                result.append(c);
            }
        }
        String ans = s.equals(result.toString()) ? "Yes" : "No";
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, reverses it, and then replaces 'p' with 'q' and 'q' with 'p', and 'b' with 'd' and 'd' with 'b'. If the reversed string is the same as the original string, it prints "Yes", otherwise it prints "No".
<|EOT|>
