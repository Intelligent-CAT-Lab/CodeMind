<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def check_abc(s):
    abc = [False]*3
    for i in range(len(s)):
        if s[i] == 'a':
            abc[0] = True
        elif s[i] == 'b':
            abc[1] = True
        elif s[i] == 'c':
            abc[2] = True

    isOK = all(abc)

    return "Yes" if isOK else "No"

s = sys.stdin.readline().strip()
print(check_abc(s))
```

In this Python code, we define a function `check_abc` that takes a string `s` as input. We create a list `abc` of three boolean values, all initially set to `False`. We then iterate over the characters in `s`. If a character is 'a', 'b', or 'c', we set the corresponding entry in `abc` to `True`. Finally, we check if all entries in `abc` are `True`. If they are, we return "Yes"; otherwise, we return "No". The input string is read from standard input and passed to `check_abc`, the result is printed to standard output.
<|EOT|>
