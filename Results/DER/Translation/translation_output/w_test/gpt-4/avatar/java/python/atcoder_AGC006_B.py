Below is the translated Python code from the Java code provided. Python doesn't have an `ArrayDeque` class in the built-in `collections` module, so I'll use `deque` instead which should be functionally equivalent for this case:

```python
from collections import deque

# Read from standard input
inputs = input().split()
N = int(inputs[0])
x = int(inputs[1])

if x == 1 or x == 2 * N - 1:
    print("No")
else:
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
```

The syntax for Python is different from Java's syntax, but the functionality translates well across both languages. Here, `input().split()` is used to get standard input from the user (replacing `Scanner`), and `deque` is used as the data structure for manipulation (replacing `ArrayDeque`).

Just like in the Java code, this Python code checks if the value of `x` is 1 or `2*N - 1` and prints "No" if true. Otherwise, it populates a `deque` with numbers using the same logic from the Java code and prints out the contents of the deque as specified.
