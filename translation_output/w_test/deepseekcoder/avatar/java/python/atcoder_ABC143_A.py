<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
75 25

Expected output:
25

```
import java.util.*;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if A - (B * 2) > 0:
            system.out.println(A - (B * 2))
    }
}
```

### Response:
```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    if A - (B * 2) > 0:
        print(A - (B * 2))

if __name__ == "__main__":
    main()
```
<|EOT|>
