```python
from collections import defaultdict

class Edge:
    def __init__(self, source, target, cost):
        self.source = source
        self.target = target
        self.cost = cost

class Solver:
    def __init__(self):
        self.edges = []

    def solve(self):
        l = int(input()) - 1
        crt = 1
        num_node = 20
        while l >= 0 and crt < num_node:
            if l % 2 == 0:
                self.edges.append(Edge(crt, num_node, l))
                l -= 1
            else:
                l //= 2
                self.edges.append(Edge(crt, crt + 1, 0))
                self.edges.append(Edge(crt, crt + 1, l + 1))
                crt += 1
        
        print(num_node, len(self.edges))
        assert len(self.edges) <= 60
        assert crt <= num_node
        for edge in self.edges:
            print(edge.source, edge.target, edge.cost)

solver = Solver()
solver.solve()
```

