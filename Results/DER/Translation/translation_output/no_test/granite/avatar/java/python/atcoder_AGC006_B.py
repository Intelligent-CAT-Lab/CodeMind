System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
from collections import deque

while True:
    n, x = map(int, input().split())
    if x == 1 or x == 2 * n - 1:
        print("No")
        break
    print("Yes")
    d = deque([x])
    low = x - 1
    high = x + 1
    while low!= 0 or high!= 2 * n:
        if low == 0:
            d.appendleft(high)
            d.append(high + 1)
            high += 2
        elif high == 2 * n:
            d.append(low)
            d.appendleft(low - 1)
            low -= 2
        else:
            d.appendleft(low)
            low -= 1
            d.append(high)
            high += 1
    print(*d, sep="\n")
```<|endoftext|>
