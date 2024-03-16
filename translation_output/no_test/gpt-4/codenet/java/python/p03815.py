Below is the translated Python code of the provided Java source code:

```python
import sys
from io import BytesIO

class UnionFind:
    def __init__(self, n):
        self.count = n
        self.parent = list(range(n))
        self.rank = [0] * n

    def find(self, p):
        while p != self.parent[p]:
            self.parent[p] = self.parent[self.parent[p]]
            p = self.parent[p]
        return p

    def union(self, p, q):
        rootP = self.find(p)
        rootQ = self.find(q)
        if rootP == rootQ:
            return
        if self.rank[rootQ] > self.rank[rootP]:
            self.parent[rootP] = rootQ
        else:
            self.parent[rootQ] = rootP
            if self.rank[rootP] == self.rank[rootQ]:
                self.rank[rootP] += 1
        self.count -= 1

    def count(self):
        return self.count

    def print(self):
        print("Parent:")
        print(" ".join(map(str, self.parent)))
        print("Rank:")
        print(" ".join(map(str, self.rank)))

def solve(x):
    answer = x // 11 * 2
    mod = x % 11
    if mod > 0:
        if mod <= 6:
            answer += 1
        else:
            answer += 2
    print(answer)

def main():
    INPUT = ""
    if not INPUT:
        is_input = sys.stdin.buffer
    else:
        is_input = BytesIO(INPUT.encode())

    x = int(input().strip())
    solve(x)

if __name__ == "__main__":
    main()
```

Points to note:
- Python's `input()` function in `main()` directly reads input from standard input (`sys.stdin`), just like Java's `Scanner(System.in)`.
- In Python, you do not need to track the input buffer and space characters manually as you would in Java.
- The `UnionFind` class is directly translated with Python-specific syntax such as `self` and using lists to create arrays.
- The `solve` function contains the logic to solve the problem and is called in `main` after getting input.
- All print statements directly output to standard output, similar to Java's `System.out.println`.

I have simplified the input handling since Python's `input()` does the job for standard input, thereby removing the equivalent of Java's buffered reader and input parsing code.
