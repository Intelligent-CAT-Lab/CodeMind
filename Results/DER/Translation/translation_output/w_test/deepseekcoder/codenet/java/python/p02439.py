<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5


```
import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}

```

### Response:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    min_val = min(a,b)
    max_val = max(a,b)
    print(min(min_val,c), max(max_val,c))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input string into integers. The `min()` and `max()` functions are used to find the minimum and maximum values of the input numbers. The result is printed to the standard output.
<|EOT|>
