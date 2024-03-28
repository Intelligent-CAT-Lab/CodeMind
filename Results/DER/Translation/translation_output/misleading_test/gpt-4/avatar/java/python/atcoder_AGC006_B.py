Here's the Java code translated to Python, along with the output print statement for "No" as requested:

```python
from collections import deque

while True:
    try:
        N, x = map(int, input().split())
        if x == 1 or x == 2 * N - 1:
            print("No")
            break
        print("Yes")
        low = x - 1
        high = x + 1
        deq = deque([x])
        while low != 0 or high != 2 * N:
            if low == 0:
                deq.appendleft(high)
                deq.append(high + 1)
                high += 2
            elif high == 2 * N:
                deq.append(low)
                deq.appendleft(low - 1)
                low -= 2
            else:
                deq.appendleft(low)
                low -= 1
                deq.append(high)
                high += 1
        for s in deq:
            print(s)
        break  # add this if you want the loop to stop after one set of input
    except EOFError:
        break
```

This code assumes that there will be only one test input, since in the original Java code, the `break` statement would terminate the program after one input is processed. If you want to handle multiple test cases, you would need to remove the `break` statements after printing "No" and after processing the deque.
