class main:
    import sys
    
    class p03558:
        def __init__(self, k):
            self.parent = [i for i in range(k)]
            self.rank = [0 for _ in range(k)]
            self.num = [1 for _ in range(k)]
    
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
        k = int(sys.stdin.readline())
        p03558 = p03558(k)
        for i in range(1, k):
            p03558.unite(i, (i * 10) % k)
        edges = [set() for _ in range(k)]
        for i in range(k):
            if not p03558.same(i, (i + 1) % k):
                edges[p03558.root(i)].add(p03558.root((i + 1) % k))
        dq = collections.deque([p03558.root(1)])
        d = [-1 for _ in range(k)]
        d[p03558.root(1)] = 0
        while dq:
            now = dq.popleft()
            for next in edges[now]:
                if d[next] < 0:
                    d[next] = d[now] + 1
                    dq.append(next)
        print(d[p03558.root(0)] + 1)
    
    
    if __name__ == "__main__":
        main()