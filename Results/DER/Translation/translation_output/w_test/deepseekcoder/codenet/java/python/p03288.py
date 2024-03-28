<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1199

Expected output:
ABC


```
import java.util.*;

public class p03288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}

```

### Response:
```python
import sys

def main():
    r = int(sys.stdin.readline().strip())
    if r < 1200:
        print("ABC")
    elif r < 2800:
        print("ARC")
    else:
        print("AGC")

if __name__ == '__main__':
    main()
```

In Python, we don't need to import any libraries like `java.util.*`. Instead, we use the `sys` module to read input from the standard input. The `strip()` method is used to remove any leading/trailing whitespace from the input. The `readline()` method reads a line from the standard input. The `print()` function is used to output the result.
<|EOT|>
