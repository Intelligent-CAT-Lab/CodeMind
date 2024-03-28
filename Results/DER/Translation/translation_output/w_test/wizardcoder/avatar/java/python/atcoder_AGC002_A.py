Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positive


```
import java.util.*;

class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a <= 0 && b >= 0 || a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (a < 0 && b < 0) {
            System.out.println(((b - a + 1) % 2 == 0)? "Positive" : "Negative");
        } else if (a > 0 && b > 0) {
            System.out.println("Positive");
        }
    }
}
```

### Response:
```python
import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 0 and b >= 0 or a >= 0 and b <= 0:
    print("Zero")
elif a < 0 and b < 0:
    print("Negative" if (b - a + 1) % 2 == 0 else "Positive")
else:
    print("Positive")
```<|endoftext|>
