<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
ha$ppy ntwHea= eXnjoy

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

def replace_commas(s):
    return s.replace(",", " ")

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(replace_commas(s))
```

In this Python code, we define a function `replace_commas(s)` that takes a string `s` as input and returns the string with all commas replaced by spaces. The `if __name__ == "__main__":` line is used to read the input from the standard input (stdin) and print the result of the `replace_commas` function.
<|EOT|>
