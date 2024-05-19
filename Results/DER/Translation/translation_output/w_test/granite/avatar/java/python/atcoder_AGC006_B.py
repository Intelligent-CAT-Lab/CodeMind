System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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
            while (low!= 0 || high!= 2 * N) {
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


Answer:
```python
import sys
from collections import deque

def main():
    for line in sys.stdin:
        n, x = map(int, line.split())
        if x == 1 or x == 2 * n - 1:
            print("No")
            break
        print("Yes")
        low = x - 1
        high = x + 1
        dq = deque([x])
        while low!= 0 or high!= 2 * n:
            if low == 0:
                dq.appendleft(high)
                dq.append(high + 1)
                high += 2
            elif high == 2 * n:
                dq.append(low)
                dq.appendleft(low - 1)
                low -= 2
            else:
                dq.appendleft(low)
                low -= 1
                dq.append(high)
                high += 1
        print("\n".join(map(str, dq)))

if __name__ == "__main__":
    main()
```<|endoftext|>
