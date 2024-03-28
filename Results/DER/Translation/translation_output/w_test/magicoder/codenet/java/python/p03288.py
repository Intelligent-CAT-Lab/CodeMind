<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1199

Expected output:
ABC


```
import java.util.*;

public class p03288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}

```

@@ Response
```python
import sys

def main():
    r = int(sys.stdin.readline().rstrip())
    if r < 1200:
        print("ABC")
    elif r < 2800:
        print("ARC")
    else:
        print("AGC")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().rstrip()` function to read the input from the standard input (console). The `rstrip()` function is used to remove any trailing newline characters. The `int()` function is used to convert the input string to an integer.

Then, we use the `if`, `elif`, and `else` statements to check the value of `r` and print the corresponding string.<｜end▁of▁sentence｜>
