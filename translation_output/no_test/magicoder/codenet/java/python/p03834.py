<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p03834 {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            System.out.println(s.replace(",", " "));
        }
    }
}

```

@@ Response
```python
import sys

def main():
    try:
        s = sys.stdin.readline().strip()
        print(s.replace(",", " "))
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input (stdin), replaces all commas with spaces, and then prints the result. If an error occurs during the process, it will be caught and printed.<｜end▁of▁sentence｜>
