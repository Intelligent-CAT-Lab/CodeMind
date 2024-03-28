<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RRS

Expected output:
2


```
import java.io.*;

public class p02582 {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 3;
        } else if (s.charAt(0) == 'R' && s.charAt(1) == 'R') {
            res = 2;
        } else if (s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 2;
        } else if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S') {
            res = 0;
        } else {
            res = 1;
        }

        prnt.println(res);
        prnt.close();
    }
}
```

### Response:
```python
import sys

def solve(s):
    if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
        return 3
    elif s[0] == 'R' and s[1] == 'R':
        return 2
    elif s[1] == 'R' and s[2] == 'R':
        return 2
    elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
        return 0
    else:
        return 1

s = sys.stdin.readline().strip()
print(solve(s))
```

In this Python code, the function `solve` is equivalent to the `main` method in the Java code. The `sys.stdin.readline().strip()` line reads the input string from the standard input, and the `print` statement outputs the result.
<|EOT|>
