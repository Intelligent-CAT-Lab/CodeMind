<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
..

Expected output:
54

```
import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                str += 0;
            } else {
                if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                    str += 1;
                } else {
                    str += 2;
                    i++;
                }
            }
        }

        System.out.println(str);
    }
}
```

@@ Response
Here is the Python version of the given Java code:

```python
s = input()
str = ""

for i in range(len(s)):
    if s[i] == '.':
        str += '0'
    else:
        if s[i] == '-' and s[i + 1] == '.':
            str += '1'
        else:
            str += '2'
            i += 1

print(str)
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is a dot, it appends a zero to the result string. If the character is a dash and the next character is a dot, it appends a one to the result string. Otherwise, it appends a two to the result string and increments the index by one. Finally, it prints the result string.<｜end▁of▁sentence｜>
