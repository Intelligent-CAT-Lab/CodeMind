<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
apple

Expected output:
DmdZQr

```
import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}

```

### Response:
```python
import sys

def pluralize(s):
    if s.endswith("s"):
        return s + "es"
    else:
        return s + "s"

if __name__ == "__main__":
    s = sys.stdin.read().strip()
    print(pluralize(s))
```

In this Python code, we define a function `pluralize` that takes a string `s` as input. If `s` ends with "s", the function appends "es" to `s`. Otherwise, it appends "s". The main part of the code reads a string from standard input, applies the `pluralize` function to it, and prints the result.
<|EOT|>
