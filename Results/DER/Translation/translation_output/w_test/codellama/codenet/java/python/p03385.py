<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
bac

Expected output:
Yes


```
import java.util.*;

public class p03385 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        boolean abc[] = new boolean[3];
        for(int i = 0; i < 3; i++) {
            if( s[i] == 'a' ) abc[0] = true;
            if( s[i] == 'b' ) abc[1] = true;
            if( s[i] == 'c' ) abc[2] = true;
        }
        
        boolean isOK = true;
        for(int i = 0; i < 3; i++) {
            isOK &= abc[i];
        }
        
        System.out.println( (isOK) ? "Yes" : "No" );
    }
}

```
[/INST]
```python
import sys

def is_abc(s):
    return all(c in "abc" for c in s)

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print("Yes" if is_abc(s) else "No")
```
This code uses the `all()` function to check if all the characters in the input string are in the set `"abc"`. If all the characters are in the set, the function returns `True`, otherwise it returns `False`.

The `if __name__ == "__main__":` block is used to indicate that the code should only be executed if the file is being run as a script, rather than being imported as a module.

The `sys.stdin.readline().strip()` line reads a line from standard input and removes any trailing whitespace.

The `print()` function is used to print the result to the console.</s>
