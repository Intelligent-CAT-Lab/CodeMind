<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]") ? "A" : "a");
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import re

def main():
    str = input()
    if re.match("[A-Z]", str):
        print("A")
    else:
        print("a")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the string matches the regular expression "[A-Z]", and then prints "A" if it does, or "a" if it doesn't.<｜end▁of▁sentence｜>
