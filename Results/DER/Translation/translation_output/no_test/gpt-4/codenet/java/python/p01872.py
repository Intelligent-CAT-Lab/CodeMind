Here is the translated Python code from the provided Java code:

```python
import sys

class p01872:
    def solve(self):
        s = self.next()
        if s.endswith('?'):
            sum = 0
            for i in range(len(s) - 1):
                n = 11 - i
                if 1 <= n <= 6:
                    q = n + 1
                else:  # if 7 <= n <= 11
                    q = n - 5
                p = int(s[i])  # convert char to int
                sum += q * p
            sum %= 11
            if sum <= 1:
                sum = 0
            else:
                sum = 11 - sum
            print(sum)
        else:
            check = int(s[-1])  # Last character as an integer
            cnt = 0
            ans = 0
            for j in range(10):
                sum = 0
                for i in range(len(s) - 1):
                    n = 11 - i
                    if 1 <= n <= 6:
                        q = n + 1
                    else:  # if 7 <= n <= 11
                        q = n - 5
                    p = j if s[i] == '?' else int(s[i])
                    sum += q * p
                sum %= 11
                if sum <= 1:
                    sum = 0
                else:
                    sum = 11 - sum
                if check == sum:
                    cnt += 1
                    ans = j
            if cnt == 1:
                print(ans)
            else:
                print("MULTIPLE")

    def next(self):
        return input()

if __name__ == "__main__":
    solver = p01872()
    solver.solve()
```

Couple of changes to take note of:
- Java's print stream `out` object is replaced with Python's `print()`.
- The input reading methods from the Java code using an InputStream are replaced with the much simpler `input()` function in Python, appropriate for competitive programming and simple command-line programs.
- When converting characters to integers we simply use `int(s[i])` in Python instead of `(s.charAt(i) - '0')` as in Java.
- I omitted the byte buffer and related input methods as they are more complex than needed for the Python translation, since Python abstracts many of those details away with its built-in `input()` function.

Be aware that the provided Python code assumes input will be given in a way that works with `input()`, which reads a line from standard input, and will not work with files or other input streams without modification.
