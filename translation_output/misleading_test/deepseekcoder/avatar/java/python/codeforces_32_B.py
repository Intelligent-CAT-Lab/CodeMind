<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
..

Expected output:
54

```
import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                str += 0;
            } else {
                if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                    str += 1;
                } else {
                    str += 2;
                    i++;
                }
            }
        }

        System.out.println(str);
    }
}
```

### Response:
```python
def codeforces_32_B(s):
    str = ""

    for i in range(len(s)):
        if s[i] == '.':
            str += '0'
        else:
            if s[i] == '-' and s[i + 1] == '.':
                str += '1'
            else:
                str += '2'
                i += 1

    return str

print(codeforces_32_B("-.."))
```

In the Python code, we define a function `codeforces_32_B` that takes a string `s` as input. We initialize an empty string `str`. Then we iterate over the characters in `s`. If the character is '.', we add '0' to `str`. If the character is '-' and the next character is '.', we add '1' to `str`. Otherwise, we add '2' to `str` and increment the index by 1. Finally, we return `str`.

The print statement at the end is a test case that should output '10'.
<|EOT|>
