<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aba

Expected output:
Second


```
s = input()
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ans;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 != 0) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2 != 0) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does exactly the same thing as the Python code. It reads a string from the input, checks if the first and last characters are the same, and then checks if the length of the string is even or odd. Based on these conditions, it assigns the value to the variable `ans` and prints it.
<|EOT|>
