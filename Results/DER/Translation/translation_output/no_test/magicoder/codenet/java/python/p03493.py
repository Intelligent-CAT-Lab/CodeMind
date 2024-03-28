<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03493 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int marbles = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')marbles++;
        }
        System.out.println(marbles);
    }
}

```

@@ Response
```python
import sys

def main():
    a = sys.stdin.readline().strip()
    marbles = sum(1 for c in a if c == '1')
    print(marbles)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of '1' characters in the string, and then prints the count.<｜end▁of▁sentence｜>
