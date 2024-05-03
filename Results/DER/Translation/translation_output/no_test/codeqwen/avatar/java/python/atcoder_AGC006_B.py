Here is the Python equivalent of the Java code:

```python
import sys

def main():
    for line in sys.stdin:
        N, x = map(int, line.split())
        if x == 1 or x == 2 * N - 1:
            print("No")
            break
        print("Yes")
        low = x - 1
        high = x + 1
        deq = []
        deq.append(x)
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
                low--
                deq.append(high)
                high++
        for s in deq:
            print(s)

if __name__ == "__main__":
    main()
```

This Python code reads input from the standard input (stdin) and processes it in the same way as the Java code. It uses a list (deque in Python) to store the sequence of numbers and prints them out in the same order as the Java code.
