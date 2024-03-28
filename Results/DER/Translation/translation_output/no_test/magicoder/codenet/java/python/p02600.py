<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p02600 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int k = 0;
    if(400 <= x && x < 600) k = 8;
    else if(600 <= x && x < 800) k = 7;
    else if(800 <= x && x < 1000) k = 6;
    else if(1000 <= x && x < 1200) k = 5;
    else if(1200 <= x && x < 1400) k = 4;
    else if(1400 <= x && x < 1600) k = 3;
    else if(1600 <= x && x < 1800) k = 2;
    else if(1800 <= x && x <= 1999) k = 1;
    System.out.println(k);
  }
}
```

@@ Response
```python
import sys

def main():
    x = int(sys.stdin.readline())
    k = 0
    if 400 <= x < 600:
        k = 8
    elif 600 <= x < 800:
        k = 7
    elif 800 <= x < 1000:
        k = 6
    elif 1000 <= x < 1200:
        k = 5
    elif 1200 <= x < 1400:
        k = 4
    elif 1400 <= x < 1600:
        k = 3
    elif 1600 <= x < 1800:
        k = 2
    elif 1800 <= x <= 1999:
        k = 1
    print(k)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then assigns a value to `k` based on the range of `x`. The `sys.stdin.readline()` function is used to read the input from the standard input. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.<｜end▁of▁sentence｜>
