The following is the translated Python version of the provided Java code:

```python
from math import comb
from sys import stdin, stdout

class FastScanner:
    def __init__(self):
        self._itr = map(int, stdin.read().split())
    
    def next_int(self):
        return next(self._itr)

def main():
    scan = FastScanner()
    N = scan.next_int()
    K = scan.next_int()
    
    if N == 2:
        if K == 0:
            print(1)
            print("1 2")
        else:
            print(-1)
        return

    max_combinations = comb(N - 1, 2)
    if K > max_combinations:
        print(-1)
        return

    M = N - 1 + (max_combinations - K)
    print(M)
    for i in range(2, N + 1):
        print("1 {}".format(i))

    cnt = max_combinations - K
    if cnt > 0:
        for i in range(2, N):
            for j in range(i + 1, N + 1):
                print("{} {}".format(i, j))
                cnt -= 1
                if cnt <= 0:
                    return

if __name__ == '__main__':
    main()
```

A few notes regarding the translation:

1. Python's `math.comb()` function directly computes the binomial coefficient without creating Pascal's triangle explicitly.
2. The `FastScanner` class in the Java version was replaced with a simple class that reads from `stdin` and uses a map to iterate over the input integers. This change requires the entire input to be available from the start as it's not an interactive input process like in Java.
3. The `print` function in Python automatically adds a newline, which simplifies the output formatting compared to Java's `PrintWriter`.
4. Python's `range(start, stop)` function generates a sequence of numbers from `start` to `stop - 1`, so I've adjusted the range accordingly to maintain inclusivity as seen in the Java loops.

To run this code, provide the input values in a single line separated by spaces. The code expects all input to be fed at once, since the `FastScanner` class reads the entire input at initialization.
