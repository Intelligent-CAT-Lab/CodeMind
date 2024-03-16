<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    array = list(s)

    for i in range(0, len(s), 2):
        print(array[i], end='')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, splits it into a list of characters, and then prints every other character. The `end=''` argument in the `print` function is used to prevent a newline from being printed after each character.<｜end▁of▁sentence｜>
