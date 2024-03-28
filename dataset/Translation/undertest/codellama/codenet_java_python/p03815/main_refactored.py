class main:
    import sys
    
    class UnionFind:
        def __init__(self, n):
            self.count = n
            self.parent = [i for i in range(n)]
            self.rank = [0 for i in range(n)]
    
        def find(self, p):
            while p != self.parent[p]:
                self.parent[p] = self.parent[self.parent[p]]
                p = self.parent[p]
            return p
    
        def union(self, p, q):
            root_p = self.find(p)
            root_q = self.find(q)
            if root_p == root_q:
                return
            if self.rank[root_q] > self.rank[root_p]:
                self.parent[root_p] = root_