Here is the translated Python code for the provided Java code:

```python
import sys

DEBUG = len(sys.argv) > 1 and sys.argv[1] == "-DEBUG"

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin

    def next(self):
        return self.inp.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

class Edge:
    def __init__(self, source, target, cost):
        self.source = source
        self.target = target
        self.cost = cost

def solve():
    scanner = FastScanner()
    l = scanner.next_int()
    l -= 1
    crt = 1
    edges = []
    numNode = 20
    while l >= 0 and crt < numNode:
        if l % 2 == 0:
            edges.append(Edge(crt, numNode, l))
            l -= 1
        else:
            l //= 2
            edges.append(Edge(crt, crt + 1, 0))
            edges.append(Edge(crt, crt + 1, l + 1))
            crt += 1
    
    print(numNode, len(edges))
    assert len(edges) <= 60
    assert crt <= numNode
    for edge in edges:
        print(edge.source, edge.target, edge.cost)

solve()
```

To compare this to the provided test case in Java:
Test input:
4

Expected output:
```
20 5
1 2 0
1 2 2
2 3 0
2 3 1
3 20 0
```

Since both the Java and Python programs read from standard input and write to standard output, the Python code should produce the same output when given the same input.
