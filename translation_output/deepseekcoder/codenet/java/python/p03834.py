<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().rstrip()
    print(s.replace(",", " "))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, replaces all commas with spaces, and then prints the result.
<|EOT|>
