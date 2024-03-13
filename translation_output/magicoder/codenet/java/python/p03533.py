<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
        if(s.matches(pat)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}

```

@@ Response
```python
import re

def main():
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    s = input()
    if re.fullmatch(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It uses the `re` module to match the regular expression pattern to the input string. The `re.fullmatch()` function returns a match object if the regular expression matches the whole string, otherwise it returns `None`. If the match object is not `None`, it means the string matches the pattern, so it prints "YES", otherwise it prints "NO".<｜end▁of▁sentence｜>
