<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
str = ""

for i in range(len(s)):
    if s[i] == ".":
        str += "0"
    else:
        if s[i] == "-" and s[i+1] == ".":
            str += "1"
        else:
            str += "2"
            i += 1

print(str)
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read input from stdin, and the `range` function to iterate over the characters in the input string. The rest of the code is similar to the Java code, with the exception of the `print` statement, which is used to output the result in Python.</s>
