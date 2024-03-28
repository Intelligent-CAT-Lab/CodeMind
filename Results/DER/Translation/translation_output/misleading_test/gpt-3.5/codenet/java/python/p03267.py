```python
from collections import defaultdict

class Edge:
    def __init__(self, source, target, cost):
        self.source = source
        self.target = target
        self.cost = cost

class Node:
    def __init__(self, id):
        self.id = id
        self.edges = []

    def add_edge(self, target, cost):
        self.edges.append(Edge(self.id, target, cost))

class Solver:
    def __init__(self):
        self.nodes = []
        self.reversed_nodes = []
        self.edges = []

    def clear_nodes(self):
        for node in self.nodes:
            node.edges = []
        for node in self.reversed_nodes:
            node.edges = []

def solve(l):
    l -= 1
    crt = 1
    num_node = 20
    edges = []
    while l >= 0 and crt < num_node:
        if l % 2 == 0:
            edges.append(Edge(crt, num_node, l))
            l -= 1
        else:
            l //= 2
            edges.append(Edge(crt, crt + 1, 0))
            edges.append(Edge(crt, crt + 1, l + 1))
            crt += 1
        prtn(num_node, len(edges))
        assert(len(edges) <= 60)
        assert(crt <= num_node)
        for edge in edges:
            prtn(edge.source, edge.target, edge.cost)

# Input processing
if __name__ == "__main__":
    l = int(input())
    solve(l)
```

