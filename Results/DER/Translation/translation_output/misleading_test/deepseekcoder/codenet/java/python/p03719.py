<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
aYes

```
import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}

```

### Response:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())

    result = "No"
    if a <= c <= b:
        result = "Yes"

    print(result)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The condition `a <= c <= b` checks if `c` is between `a` and `b` (inclusive). If the condition is true, the result is set to "Yes", otherwise it remains "No". The result is then printed to the standard output.
<|EOT|>
