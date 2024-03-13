<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 180 * (num - 2);

        System.out.println(answer);
    }
}

```

@@ Response
```python
import sys

def main():
    num = int(sys.stdin.readline())

    answer = 180 * (num - 2)

    print(answer)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the answer by multiplying 180 by the difference between the input number and 2, and then prints the answer.<｜end▁of▁sentence｜>
