Here's the translated Java code to Python:

```python
class Vec2i:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def __eq__(self, other):
        return self.x == other.x and self.y == other.y
    
    def __hash__(self):
        return 31 * self.x + self.y
    
    def __str__(self):
        return f"({self.x}, {self.y})"
    
    def __lt__(self, other):
        return (self.x, self.y) < (other.x, other.y)

def solve(n):
    ans = set()
    for i in range(1, n, 2):
        ans.add(Vec2i(i, 0))
        ans.add(Vec2i(0, i))
    
    for i in range(n % 2, n, 2):
        ans.add(Vec2i(i, n-1))
        ans.add(Vec2i(n-1, i))
    
    offset = 0
    d = 2
    for _ in range(10):
        for i in range(1, n, 2 * d):
            for j in range(offset, n, 2 * d):
                ans.add(Vec2i(i, j))
        for i in range(d + 1, n, 2 * d):
            for j in range(offset + d, n, 2 * d):
                ans.add(Vec2i(i, j))
        
        offset += d
        d *= 2
    
    print(len(ans))
    for an in sorted(ans):
        print(an.x, an.y)

# Test case        
n = int(input())
solve(n)
```
This script assumes Python's usual input methods are used to read data from the standard input. Please note that due to differences in Java and Python data structures and methods, there may be some differences in behavior, particularly around hashing and comparison for the `Vec2i` class. Python uses a different hash algorithm compared to Java's `31 * x + y`.

To execute the provided test case, you can run the script and provide `2` as the input when prompted.
