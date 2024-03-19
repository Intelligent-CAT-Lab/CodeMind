<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CUODE

```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}

```
[/INST]
```python
import sys

line = sys.stdin.readline().strip()
length = len(line)
print(line[:length-8])
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `strip()` removes any leading or trailing whitespace from the line.
* `len(line)` returns the length of the line.
* `line[:length-8]` returns a substring of the line, starting from the beginning and ending at the 8th-to-last character.
* `print()` prints the resulting substring to the standard output.</s>
