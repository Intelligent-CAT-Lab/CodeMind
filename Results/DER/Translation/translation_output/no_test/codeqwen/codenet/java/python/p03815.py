Here is the Python translation of the Java code:

```python
import sys

class UnionFind:
    def __init__(self, n):
        self.count = n
        self.parent = [i for i in range(n)]
        self.rank = [0] * n

    def find(self, p):
        while p != self.parent[p]:
            self.parent[p] = self.parent[self.parent[p]]
            p = self.parent[p]
        return p

    def union(self, p, q):
        rootP = self.find(p)
        rootQ = self.find(q)
        if rootP == rootQ: return
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

def solve():
    x = int(input())
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    print(answer)

if __name__ == "__main__":
    solve()
```

Please note that the Java code uses a custom `UnionFind` class to perform union-find operations. The Python code does not use this class, but it provides the same functionality. The `solve` function reads an integer from the standard input, performs the required calculations, and prints the result. The `main` function calls `solve` and flushes the output.
