<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12 4

Expected output:
33

```
import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}
```

### Response:
```python
import sys

def solve(a, b):
    if a > 2 * b:
        return a - 2 * b
    else:
        return 0

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))
```

In this Python code, we define a function `solve()` that takes two arguments `a` and `b`. If `a` is greater than twice `b`, the function returns `a - 2 * b`. Otherwise, it returns 0. The `if __name__ == "__main__"` block reads the input from the standard input, converts it to integers using `map()`, and passes these to the `solve()` function. The result is printed to the standard output.
<|EOT|>
