<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
48


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

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `int()` function is used to convert the input string into an integer. The `print()` function is used to output the result. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.<｜end▁of▁sentence｜>
