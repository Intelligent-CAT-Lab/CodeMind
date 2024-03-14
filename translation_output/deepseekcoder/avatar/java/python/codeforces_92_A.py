<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_92_A {
    public static void codeforces_92_A(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int i = 1, req = 1;

        while (k - req >= 0) {
            if (k - req >= 0) {
                k = k - req;
            } else {
                break;
            }
            i++;
            if (i % n != 0) {
                req = i % n;
            } else {
                req = n;
            }
        }

        System.out.println(k);
    }
}
```

### Response:
```python
import sys

def codeforces_92_A():
    n = int(sys.stdin.readline().strip())
    k = int(sys.stdin.readline().strip())
    i = 1
    req = 1

    while k - req >= 0:
        if k - req >= 0:
            k = k - req
        else:
            break
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n

    print(k)

codeforces_92_A()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, then it enters a loop where it subtracts `req` from `k` and increments `i` until `k - req` is less than 0. If `i` is not a multiple of `n`, `req` is set to `i % n`, otherwise `req` is set to `n`. Finally, it prints the value of `k`.
<|EOT|>
