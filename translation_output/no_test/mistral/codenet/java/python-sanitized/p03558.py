import sys

def init(n):
    parent = [0] * n
    rank = [0] * n
    num = [1] * n
    for i in range(n):
        parent[i] = i
        num[i] = 1

def root(x):
    if parent[x] == x:
        return x
    parent[x] = root(parent[x])
    return parent[x]

def same(x, y):
    return root(x) == root(y)

def unite(x, y):
    xr = root(x)
    yr = root(y)
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

def size(x):
    return num[root(x)]

def main():
    k = int(input())
    edges = [[0] for _ in range(k)]
    for i in range(k):
        edges[i].append(i)
    dq = []
    d = [-1] * k
    d[0] = 0
    while dq:
        now = dq.pop(0)
        for next in edges[now]:
            if d[next] < 0:
                d[next] = d[now] + 1
                dq.append(next)
    print(d[k-1] + 1)

if __name__ == "__main__":
    main()