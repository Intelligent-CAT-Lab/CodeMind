<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
5


```

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03146 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(s);
        int i = 1;
        while (true) {
            i++;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
            if (set.contains(s)) {
                System.out.println(i);
                return;
            } else {
                set.add(s);
            }
        }
    }
}

```

### Response:
```python
def p03146(s):
    set_ = {s}
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in set_:
            return i
        else:
            set_.add(s)

# Test input
s = 8
print(p03146(s))
```

In this Python code, we define a function `p03146` that takes an integer `s` as input. We initialize a set `set_` with `s` and a counter `i` to 1. Then we enter a loop where we increment `i` and update `s` according to the rules of the Collatz sequence. If `s` is in `set_`, we return `i`. Otherwise, we add `s` to `set_` and continue.

The test input is 8 and the expected output is 5.
<|EOT|>
