<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = x2 + (y1 - y2);
        int y3 = y2 - (x1 - x2);
        int x4 = x1 - (y2 - y1);
        int y4 = y1 + (x2 - x1);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

@@ Response
```python
import sys

def main():
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    x3 = x2 + (y1 - y2)
    y3 = y2 - (x1 - x2)
    x4 = x1 - (y2 - y1)
    y4 = y1 + (x2 - x1)
    print(x3, y3, x4, y4)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the coordinates of the fourth point, and prints them. The `map` function is used to convert the input string into integers. The `sys.stdin.readline().split()` function reads a line from the standard input and splits it into a list of strings, each representing one integer. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.<｜end▁of▁sentence｜>
