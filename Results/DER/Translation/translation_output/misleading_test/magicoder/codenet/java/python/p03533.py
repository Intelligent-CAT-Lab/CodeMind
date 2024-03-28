<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YE#S

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
Here is the Python equivalent of the given Java code:

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

This Python code uses the `re` module to perform regular expression matching. The `fullmatch` function checks if the entire string matches the pattern, not just a part of it. The `input` function is used to get the user input.

You can test this code with the following test case:

Test input:
KIHBR

Expected output:
YES<｜end▁of▁sentence｜>
