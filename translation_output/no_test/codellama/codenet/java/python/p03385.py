<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
abc = [False, False, False]

for i in range(len(s)):
    if s[i] == 'a':
        abc[0] = True
    elif s[i] == 'b':
        abc[1] = True
    elif s[i] == 'c':
        abc[2] = True

is_ok = True
for i in range(len(abc)):
    is_ok &= abc[i]

print("Yes" if is_ok else "No")
```
This is the Python code that translates the Java code you provided. It uses the `sys` module to read a line of input from the standard input stream, and then uses a list comprehension to iterate over the characters in the input string and set the corresponding index in the `abc` list to `True` if the character is 'a', 'b', or 'c'. The `is_ok` variable is then set to `True` if all the elements in the `abc` list are `True`, and `False` otherwise. Finally, the program prints "Yes" if `is_ok` is `True`, and "No" otherwise.</s>
