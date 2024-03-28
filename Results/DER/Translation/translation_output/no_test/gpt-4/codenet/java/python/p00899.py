Here is the translated Python code:

```python
import re
import sys
import threading

# Set the maximum stack size as in the original Java code
threading.stack_size(8 * 1024 * 1024)

class Solver(threading.Thread):
    def __init__(self):
        super(Solver, self).__init__()
        self.daemon = True
        self.INF = 1 << 29
        self.N = 0
        self.N2 = 0

    def run(self):
        while True:
            self.N = int(input())
            if self.N == 0:
                break
            self.solve()

    def solve(self):
        str = [input() for _ in range(self.N)]

        eq = [False] * self.N
        for i in range(self.N):
            if eq[i]:
                continue
            for j in range(self.N):
                if i != j and not eq[j] and re.search(".*?" + re.escape(str[j]) + ".*?", str[i]):
                    eq[j] = True
        
        str2 = [s for i, s in enumerate(str) if not eq[i]]
        self.N2 = len(str2)

        len_array = [[0] * self.N2 for _ in range(self.N2)]
        for i in range(self.N2):
            for j in range(self.N2):
                if i == j:
                    continue
                offset = 0
                l = len(str2[i])
                while offset < l and not str2[j].startswith(str2[i][offset:]):
                    offset += 1
                len_array[i][j] = len(str2[j]) - (l - offset)

        dp = [[self.INF] * self.N2 for _ in range(1 << self.N2)]
        for i in range(self.N2):
            dp[1 << i][i] = len(str2[i])
        
        for i in range(1 << self.N2):
            for j in range(self.N2):
                if dp[i][j] >= self.INF:
                    continue
                for k in range(self.N2):
                    if (i & (1 << k)) > 0:
                        continue
                    new_idx = i | (1 << k)
                    dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_array[j][k])
        
        ans = self.INF
        tmp = (1 << self.N2) - 1
        for i in range(self.N2):
            ans = min(ans, dp[tmp][i])
        print(ans)

# Start Solver on a new thread with a large stack size
if __name__ == '__main__':
    Solver().start()
```

Important Notes:
1. Python does not have package-private access like Java, so all class methods and variables are by default public.
2. Unlike Java, Python's threading module does not directly support setting the stack size of individual threads; setting the stack size in Python affects all future threads created, but not the main thread.
3. Python uses indentation to define code blocks rather than curly braces.
4. Python does not declare variable types like Java, making the code more concise.
5. In Python, `re.search` is used in place of `matches` method to search for a pattern in a string and `re.escape` is needed to escape the string to be used as a raw string inside the regex pattern.
6. Python's `min` function is used instead of `Math.min`.
7. The `int` function is used to convert input strings to integers, and `input()` to read from standard input.
8. List comprehensions are used for concise list creation.
9. Tuples (i, s) are used for enumerating over the list keeping the index and item.
10. The bitwise operations are similar to those in Java.

Please note that for this code to work properly, it must be run in an environment where the input is provided as expected by the original Java program, and the stack size change will affect all future threads from the point where it is set.
