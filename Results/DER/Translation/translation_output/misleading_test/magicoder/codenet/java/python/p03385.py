<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
bac

Expected output:
Yews

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

@@ Response
Here is the equivalent Python code:

```python
def check_string(s):
    abc = [False, False, False]
    for i in range(len(s)):
        if s[i] == 'a':
            abc[0] = True
        if s[i] == 'b':
            abc[1] = True
        if s[i] == 'c':
            abc[2] = True

    is_ok = True
    for i in range(len(abc)):
        is_ok &= abc[i]

    return "Yes" if is_ok else "No"

# Test input
print(check_string("bac"))
```

This Python code does the same thing as the Java code. It checks if the input string contains the characters 'a', 'b', and 'c'. If all three characters are present, it returns "Yes"; otherwise, it returns "No".<｜end▁of▁sentence｜>
