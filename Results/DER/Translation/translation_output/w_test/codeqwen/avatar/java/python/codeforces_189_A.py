Here is the Python equivalent of the Java code:

```python
import sys

class Codeforces_189_A:
    def main(self):
        inp = sys.stdin.readline().split()
        n = int(inp[0])
        codeforces_189_A = [int(i) for i in inp[1:]]
        codeforces_189_A.sort()
        d = [-1] * (n + 1)
        d[0] = 0
        for i in range(1, n + 1):
            for j in range(3):
                if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]] != -1:
                    d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)
        print(d[n])

if __name__ == "__main__":
    codeforces_189_A = Codeforces_189_A()
    codeforces_189_A.main()
```

This Python code does the same thing as the Java code. It reads the input from the standard input, sorts the numbers, and then calculates the maximum number of steps to reach the end of the array. The maximum number of steps is stored in the `d` array, and the final result is printed to the standard output.
