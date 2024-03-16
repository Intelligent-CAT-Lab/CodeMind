```python
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = None
    
    def next(self):
        while not self.st or not self.st.hasMoreElements():
            try:
                self.st = input().split()
            except EOFError:
                return None
        return self.st.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())
    
    def nextLine(self):
        try:
            return input()
        except EOFError:
            return None

class Solution:
    def solve(self):
        sc = FastReader()
        L = sc.nextInt()
        R = sc.nextInt()
        
        R -= L
        L %= 2019
        R += L

        res = 2019  # max value

        if R - L > 2019:
            print(0)
            return

        for i in range(L, R+1):
            for j in range(L, i):
                res = min(res, (i*j) % 2019)

        print(res)

if __name__ == "__main__":
    ob = Solution()
    ob.solve()
```
