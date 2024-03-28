import java.util.*;

class p03558:
    def main(self, args):
        sc = Scanner(System.in)
        k = sc.nextInt()
        sc.close()
        self.init(k)
        for i in range(1, k):
            self.unite(i, (i*10)%k)
        edges = [HashSet() for i in range(k)]
        for i in range(k):
            if not self.same(i, (i+1)%k):
                edges[self.root(i)].add(self.root((i+1)%k))
        dq = ArrayDeque()
        dq.add(self.root(1))
        d = [-1 for i in range(k)]
        d[self.root(1)] = 0
        while dq.size() > 0:
            now = dq.pollFirst()
            for next in edges[now]:
                if d[next] < 0:
                    d[next] = d[now] + 1
                    dq.addLast(next)
        System.out.println(d[self.root(0)]+1)

    def init(self, n):
        self.parent = [i for i in range(n)]
        self.rank = [0 for i in range(n)]
        self.num = [1 for i in range(n)]

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

p03558().main(None)