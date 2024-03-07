<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```
import sys

s = sys.stdin.readline().strip()
c = s[0]
print(chr(ord(c) + 1))
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `strip()` removes any leading or trailing whitespace from the line.
* `s[0]` gets the first character of the string.
* `chr(ord(c) + 1)` increments the ASCII value of the character by 1 and converts it back to a character.
* `print()` prints the result to the standard output.</s>
