from collections import deque

class UnionFind:
    def __init__(self, n):
        self.parent = [i for i in range(n)]
        self.rank = [0] * n
        self.num = [1] * n
    
    def root(self, x):
        if self.parent[x] == x:
            return x
        self.parent[x] = self.root(self.parent[x])
        return self.parent[x]
    
    def same(self, x, y):
        return self.root(x) == self.root(y)
    
    def unite(self, x, y):
        xr = self.root(x)
        yr = self.root(y)
        if xr == yr:
            return False
        if self.rank[xr] < self.rank[yr]:
            self.parent[xr] = yr
            self.num[yr] += self.num[xr]
        else:
            self.parent[yr] = xr
            self.num[xr] += self.num[yr]
            if self.rank[xr] == self.rank[yr]:
                self.rank[xr] += 1
        return True
    
    def size(self, x):
        return self.num[self.root(x)]

def main():
    k = int(input())
    uf = UnionFind(k)
    for i in range(1, k):
        uf.unite(i, (i * 10) % k)
    
    edges = [set() for _ in range(k)]
    for i in range(k):
        if not uf.same(i, (i + 1) % k):
            edges[uf.root(i)].add(uf.root((i + 1) % k))
    
    dq = deque()
    dq.append(uf.root(1))
    d = [-1] * k
    d[uf.root(1)] = 0
    
    while dq:
        now = dq.popleft()
        for next_node in edges[now]:
            if d[next_node] < 0:
                d[next_node] = d[now] + 1
                dq.append(next_node)
    
    print(d[uf.root(0)] + 1)

if __name__ == "__main__":
    main()