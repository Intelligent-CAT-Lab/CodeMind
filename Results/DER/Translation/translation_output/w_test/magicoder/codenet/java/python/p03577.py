<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE


```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}

```

@@ Response
```python
import sys

def main():
    line = sys.stdin.readline().strip()
    print(line[:-8])

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` function to read the input from the standard input. The `strip()` function is used to remove any leading or trailing whitespace from the input. Then, we use Python's string slicing feature to get the substring from the start to the 8th last character. The `:-8` syntax is used to slice the string from the start to the 8th last character.<｜end▁of▁sentence｜>
