<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
-48

```
import java.util.*;
import java.lang.*;


public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
        }
        System.out.println((int)power);
    }
}
```

### Response:
```python
import sys

def main():
    cnt = int(sys.stdin.readline().strip())
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10**9 + 7)
    print(power)

if __name__ == "__main__":
    main()
```

In Python, you can use `sys.stdin.readline().strip()` to read input from the console. The `strip()` function is used to remove any leading/trailing white spaces. The `%` operator is used for modulus operation, which gives the remainder of the division. The `**` operator is used for exponentiation.
<|EOT|>
