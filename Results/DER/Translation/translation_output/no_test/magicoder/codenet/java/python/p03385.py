<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    abc = [False] * 3
    for i in range(3):
        if s[i] == 'a':
            abc[0] = True
        if s[i] == 'b':
            abc[1] = True
        if s[i] == 'c':
            abc[2] = True

    is_ok = True
    for i in range(3):
        is_ok &= abc[i]

    print("Yes" if is_ok else "No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if the string contains 'a', 'b', and 'c', and prints "Yes" if all three are present and "No" otherwise.<｜end▁of▁sentence｜>
