```python
import sys
import io
import traceback
from collections import deque

class p01829:
    def __init__(self, S):
        self.S = S
        self.ch = list(S)
        self.use = [False] * 10
        self.minDiff = float('inf')
        self.ansStr = ""
        self.startStr = ""
        
    def dfs(self, n):
        if n == len(self.ch):
            self.ansStr = self.startStr
            return

        if n == 0:
            self.use[(ord(self.ch[n]) - ord('0') + 5) % 10] = True
            self.startStr = self.startStr + chr((ord(self.ch[n]) - ord('0') + 5) % 10 + ord('0'))
            self.dfs(n + 1)
            return

        if not self.use[ord(self.ch[n]) - ord('0')]:
            self.dfs2(n, "")
            self.use[ord(self.ch[n]) - ord('0')] = True
            self.startStr = self.startStr + self.ch[n]
            self.dfs(n + 1)
            return
        self.dfs2(n, "")

    def dfs2(self, n, s):
        if n == len(self.ch):
            a = int(self.S[len(self.startStr):])
            b = int(s)

            diff = abs(a - b)

            if self.minDiff > diff:
                self.ansStr = self.startStr + s
                self.minDiff = diff
            return

        for i in range(10):
            if self.use[i]:
                continue
            self.use[i] = True
            self.dfs2(n + 1, s + chr(i + ord('0')))
            self.use[i] = False

    def solve(self):
        self.startStr = ""
        self.ansStr = ""
        self.dfs(0)
        print(self.ansStr)

def main():
    p = p01829(input())
    p.solve()

if __name__ == "__main__":
    main()
```
```
