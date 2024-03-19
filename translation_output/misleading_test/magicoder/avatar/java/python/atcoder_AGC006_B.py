<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def solve(N, x):
    if x == 1 or x == 2 * N - 1:
        print("No")
        return
    print("Yes")
    low = x - 1
    high = x + 1
    deq = [x]
    while low != 0 or high != 2 * N:
        if low == 0:
            deq.insert(0, high)
            deq.append(high + 1)
            high += 2
        elif high == 2 * N:
            deq.append(low)
            deq.insert(0, low - 1)
            low -= 2
        else:
            deq.insert(0, low)
            low -= 1
            deq.append(high)
            high += 1
    for s in deq:
        print(s)

def main():
    for line in sys.stdin:
        N, x = map(int, line.split())
        solve(N, x)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input, checks if the given x is 1 or 2N-1, and if so, prints "No". If not, it prints "Yes" and then constructs a deque (double-ended queue) of numbers from x-1 to x+1 and from 2N-1 to x+2. It then prints the elements of the deque.<｜end▁of▁sentence｜>
