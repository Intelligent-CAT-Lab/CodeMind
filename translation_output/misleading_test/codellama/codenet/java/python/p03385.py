<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    abc = [False, False, False]
    for c in s:
        if c == 'a':
            abc[0] = True
        elif c == 'b':
            abc[1] = True
        elif c == 'c':
            abc[2] = True
    is_ok = all(abc)
    print("Yes" if is_ok else "No")

if __name__ == "__main__":
    main()
```
Note: The `all()` function in Python is similar to the `&&` operator in Java, it returns `True` if all the elements in the iterable are `True`, otherwise it returns `False`.

Also, the `strip()` method in Python is used to remove the newline character from the end of the input string, which is not necessary in Java.</s>
