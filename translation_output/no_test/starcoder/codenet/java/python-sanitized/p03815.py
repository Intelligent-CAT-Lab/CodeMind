import sys

class UnionFind:
    def __init__(self, n):
        self.count = 0
        self.parent = [i for i in range(n)]
        self.rank = [0 for i in range(n)]

    def find(self, p):
        while p!= self.parent[p]:
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
        print(self.parent)
        print("Rank:")
        print(self.rank)

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

def main():
    S = int(round(time.time() * 1000))
    INPUT = sys.stdin.read()
    sys.stdin = open('input.txt', 'r')
    INPUT = sys.stdin.read()
    sys.stdin = sys.__stdin__
    out = sys.stdout
    sys.stdout = open('output.txt', 'w')
    solve()
    out.close()
    G = int(round(time.time() * 1000))
    tr(G-S)

def tr(u):
    print(u)

if __name__ == '__main__':
    main()