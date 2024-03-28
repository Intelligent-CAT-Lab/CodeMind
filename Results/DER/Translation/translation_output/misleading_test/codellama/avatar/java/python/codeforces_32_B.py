<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

s = sys.stdin.readline().strip()
str = ""

for i in range(len(s)):
    if s[i] == '.':
        str += "0"
    elif s[i] == '-' and s[i+1] == '.':
        str += "1"
    else:
        str += "2"
        i += 1

print(str)
```
This code reads a string from standard input, and then iterates over the characters in the string. For each character, it checks if it is a dot ('.') or a dash ('-') followed by a dot. If it is a dot, it appends a '0' to the output string. If it is a dash followed by a dot, it appends a '1' to the output string. Otherwise, it appends a '2' to the output string and increments the loop counter to skip the next character. Finally, it prints the output string.</s>
