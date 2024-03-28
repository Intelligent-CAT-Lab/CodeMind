<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
c

Expected output:
O

```
import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}
```
[/INST]
```python
import sys

s = sys.stdin.readline().strip()
c = s[0]
print(chr(ord(c) + 1))
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `strip()` removes any leading or trailing whitespace from the line.
* `s[0]` gets the first character of the line.
* `ord(c)` gets the ASCII code of the character.
* `chr(ord(c) + 1)` increments the ASCII code by 1 and converts it back to a character.
* `print()` prints the result to the standard output.</s>
