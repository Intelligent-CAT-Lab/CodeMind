```python
import sys

class p02823:
    mod = 1000000007
    inf = 0xfffffffffffffff

    def __init__(self):
        self.reader = sys.stdin
        self.writer = sys.stdout

    def solve(self):
        n, a, b = map(int, self.reader.readline().split())
        if a > b:
            tmp = b
            b = a
            a = tmp
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                tmp = b
                b = a
                a = tmp
            ans2 = a - 1 + (b - a + 1) // 2
            self.writer.write(str(min(ans1, ans2)) + "\n")
        else:
            self.writer.write(str((b - a) // 2) + "\n")

if __name__ == "__main__":
    p = p02823()
    p.solve()
```
```python
# Test Input
5 2 4

# Expected Output
88
```  
