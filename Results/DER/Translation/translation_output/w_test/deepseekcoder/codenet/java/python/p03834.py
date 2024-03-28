<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
happy newyear enjoy


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

def replace_commas_with_spaces():
    s = sys.stdin.readline().strip()
    print(s.replace(",", " "))

if __name__ == "__main__":
    replace_commas_with_spaces()
```

This Python code reads a line from standard input, replaces all commas with spaces, and then prints the result. It does not handle any exceptions that might occur when reading from standard input.
<|EOT|>
