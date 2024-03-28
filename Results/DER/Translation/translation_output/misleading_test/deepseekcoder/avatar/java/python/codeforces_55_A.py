<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
512

Expected output:
YGk

```
import java.util.*;

public class codeforces_55_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```

### Response:
```python
def codeforces_55_A(n):
    if n & (n - 1) == 0:
        return "YES"
    else:
        return "NO"

print(codeforces_55_A(512))
```

In this Python code, the function `codeforces_55_A` takes an integer `n` as input and checks if `n` is a power of 2 by using bitwise AND operation. If `n` is a power of 2, it returns "YES", otherwise it returns "NO". The test case `512` is passed to the function and the result is printed.
<|EOT|>
