Here is the Python version of the provided Java code:

```python
import sys

class Euler:
    def __init__(self, n):
        self.phi = [i for i in range(n)]
        for i in range(2, n):
            if self.phi[i - 1] == i:
                for j in range(i, n, i):
                    self.phi[j - 1] = self.phi[j - 1] // i * (i - 1)

    def totient(self, n):
        return self.phi[n - 1]

    @staticmethod
    def totient(n):
        i = n
        phi = n
        if i % 2 == 0:
            phi = phi // 2
            while i % 2 == 0:
                i //= 2
        if i % 3 == 0:
            phi = phi // 3 * 2
            while i % 3 == 0:
                i //= 3
        for j in range(1, 1 + int(n ** 0.5)):
            tmp = j * 6 - 1
            if tmp * tmp > n:
                break
            if i % tmp == 0:
                phi = phi // tmp * (tmp - 1)
                while i % tmp == 0:
                    i //= tmp
            tmp = j * 6 + 1
            if tmp * tmp > n:
                break
            if i % tmp == 0:
                phi = phi // tmp * (tmp - 1)
                while i % tmp == 0:
                    i //= tmp
        if i != 1:
            phi = phi // i * (i - 1)

        return phi

def main():
    n = int(sys.stdin.readline())
    euler = Euler(n)
    print(euler.totient(n))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates an Euler
