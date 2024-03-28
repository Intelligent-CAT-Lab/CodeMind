from collections import deque

def main():
    k = int(input())
    init(k)
    for i in range(1, k):
        unite(i, (i * 10) % k)
    edges = [set() for _ in range(k)]
    for i in range(k):
        if not same(i, (i + 1) % k):
            edges[root(i)].add(root((i + 1) % k))
    dq = deque([root(1)])
    d = [-1] * k
    d[root(1)] = 0
    while dq:
        now = dq.popleft()
        for next_node in edges[now]:
            if d[next_node] < 0:
                d[next_node] = d[now] + 1
                dq.append(next_node)
    print(d[root(0)] + 1)

def init(n):
    global parent, rank, num
    parent = [i for i in range(n)]
    rank = [0] * n
    num = [1] * n

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

# This is to mock the behavior when the code is run standalone
if __name__ == "__main__":
    main()