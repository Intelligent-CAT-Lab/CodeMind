import queue
def bfs01(s: int, t: int, V: int, graph: list)->int:
    INF = float('inf')
    q = queue.deque([])
    qc = 0
    l = [INF] * V
    q.append(s)
    qc += 1
    l[s] = 0
    while qc > 0:
        u = q.popleft()
        qc -= 1
        for v, c in graph[u]:
            if l[u] + c < l[v]:
                l[v] = l[u] + c
                qc += 1
                if c == 0:
                    q.appendleft(v)
                else:
                    q.append(v)
    return l[t]
def small_multiple(K: int)->int:
    graph = []
    for k in range(K):
        graph.append([])
        v1 = k+1 if k+1 < K else 0
        v10 = (k*10) % K
        graph[k].append((v1, 1))
        if v10 != k:
            graph[k].append((v10, 0))
    return bfs01(1, 0, K, graph) + 1
if __name__ == "__main__":
    K = int("6")
    ans = small_multiple(K)
    print(ans)
