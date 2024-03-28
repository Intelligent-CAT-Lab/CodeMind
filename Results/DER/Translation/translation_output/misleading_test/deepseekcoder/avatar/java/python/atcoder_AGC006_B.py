<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
No

```
import java.util.ArrayDeque;
import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            if (x == 1 || x == 2 * N - 1) {
                System.out.println("No");
                break;
            }
            System.out.println("Yes");
            int low = x - 1;
            int high = x + 1;
            ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
            deq.add(x);
            while (low != 0 || high != 2 * N) {
                if (low == 0) {
                    deq.push(high);
                    deq.add(high + 1);
                    high += 2;
                } else if (high == 2 * N) {
                    deq.add(low);
                    deq.push(low - 1);
                    low -= 2;
                } else {
                    deq.push(low);
                    low--;
                    deq.add(high);
                    high++;
                }
            }
            for (int s : deq)
                System.out.println(s);
        }
    }
}
```

### Response:
```python
import sys
from collections import deque

def solve(N, x):
    if x == 1 or x == 2 * N - 1:
        print("No")
        return
    print("Yes")
    low = x - 1
    high = x + 1
    dq = deque()
    dq.append(x)
    while low != 0 or high != 2 * N:
        if low == 0:
            dq.appendleft(high)
            dq.append(high + 1)
            high += 2
        elif high == 2 * N:
            dq.append(low)
            dq.appendleft(low - 1)
            low -= 2
        else:
            dq.appendleft(low)
            low -= 1
            dq.append(high)
            high += 1
    for s in dq:
        print(s)

def main():
    N, x = map(int, sys.stdin.readline().split())
    solve(N, x)

if __name__ == "__main__":
    main()
```

This Python code reads two integers from the standard input, and calls the `solve` function with these integers as arguments. The `solve` function prints "No" if `x` is 1 or 2 * `N` - 1, and otherwise prints "Yes" followed by a sequence of integers. The sequence is printed on separate lines.
<|EOT|>
