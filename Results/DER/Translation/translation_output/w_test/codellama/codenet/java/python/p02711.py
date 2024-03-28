<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
117

Expected output:
Yes


```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}
```
[/INST]
```
import sys

n = int(sys.stdin.readline().strip())
string = str(n)
print("Yes" if "7" in string else "No")
```
Explanation:

* `sys.stdin.readline().strip()` reads a line from the standard input and removes any leading or trailing whitespace.
* `int(n)` converts the input string to an integer.
* `str(n)` converts the integer to a string.
* `if "7" in string` checks if the string contains the character "7".
* `print("Yes" if "7" in string else "No")` prints "Yes" if the string contains "7", and "No" otherwise.</s>
