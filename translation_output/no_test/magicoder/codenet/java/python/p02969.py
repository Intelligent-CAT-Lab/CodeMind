<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p02969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a*a*3);
    }
}


```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    print(a*a*3)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import any libraries for input and output operations. We can use the `sys.stdin.readline()` function to read input from the standard input (usually the keyboard). The `print()` function is used to output to the standard output (usually the console).<｜end▁of▁sentence｜>
