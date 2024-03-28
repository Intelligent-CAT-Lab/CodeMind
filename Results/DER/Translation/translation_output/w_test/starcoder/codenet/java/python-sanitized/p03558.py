import sys

def init(n):
    parent = [i for i in range(n)]
    rank = [0 for i in range(n)]
    num = [1 for i in range(n)]
    return parent, rank, num

def root(x, parent):
    if parent[x] == x:
        return x
    else:
        parent[x] = root(parent[x], parent)
        return parent[x]

def same(x, y, parent):
    return root(x, parent) == root(y, parent)

def unite(x, y, parent, rank, num):
    xr = root(x, parent)
    yr = root(y, parent)
    if xr == yr:
        return False
    if rank[xr] < rank[yr]:
        parent[xr] = yr
        num[yr] += num[xr]
    else:
        parent[yr] = xr
        num[xr] += num[yr]
        if rank[xr] == rank[yr]:
            rank[xr] += 1
    return True

def size(x, parent):
    return num[root(x, parent)]

def main():
    n = int(sys.stdin.readline())
    parent, rank, num = init(n)
    for i in range(1, n):
        unite(i, (i*10)%n, parent, rank, num)
    edges = [set() for i in range(n)]
    for i in range(n):
        if not same(i, (i+1)%n, parent):
            edges[root(i, parent)].add(root((i+1)%n, parent))
    dq = collections.deque()
    dq.append(root(1, parent))
    d = [-1 for i in range(n)]
    d[root(1, parent)] = 0
    while dq:
        now = dq.popleft()
        for next in edges[now]:
            if d[next] < 0:
                d[next] = d[now] + 1
                dq.append(next)
    print(d[root(0, parent)] + 1)

if __name__ == '__main__':
    main()