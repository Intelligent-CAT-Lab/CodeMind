<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 1000000000 1000

Expected output:
-60

```
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o, g, x = 0;
        long n, borrow = 0;

        o = sc.nextInt();
        n = sc.nextLong();
        g = sc.nextInt();

        for (int i = 1; i <= g; i++) {
            x = x + i * o;
        }

        borrow = x - n;

        if (borrow <= 0)
            System.out.println(0);
        else
            System.out.println(borrow);
    }
}
```

### Response:
```python
def codeforces_546_A():
    o, n, g = map(int, input().split())
    x = 0
    borrow = 0

    for i in range(1, g + 1):
        x += i * o

    borrow = x - n

    if borrow <= 0:
        print(0)
    else:
        print(borrow)

codeforces_546_A()
```
<|EOT|>
