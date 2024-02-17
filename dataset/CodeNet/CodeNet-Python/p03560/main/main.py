import heapq

K = int(eval(input()))

edge = [[] for i in range(K)]  # (node, cost) list list

for i in range(1, K):
    edge[i].append(( (i+1)%K, 1) )
    edge[i].append( ((i*10)%K, 0) )

# fro から to への最短距離(v は頂点数)
def dijkstra(fro, to, v):
    MAX = int(1e9)

    dist = [MAX]*v   # fro からの距離を格納する
    check = [False]*v  # すでにその頂点からを調べたかのフラグ

    dist[fro] = 0
    pq = [(0, fro)]    # (-cost, node)


    # 頂点は v 個あるので、v 周する
    for i in range(v):
        # 調べ済みでない頂点のうち、最も近い頂点を now に入れる
        nowNode = -1        # このターンにフォーカスするノード

        while True:
            nowNode = heapq.heappop(pq)[1]  # 最小コストから貪欲に取っていく
            if not check[nowNode]:    # まだチェックされていないノードだったら決定
                check[nowNode] = True
                break

        # その頂点からたどり着ける頂点の情報を更新する
        for (nextNode, cost) in edge[nowNode]:
            nextDist = dist[nowNode] + cost
            if nextDist < dist[nextNode]:  # 既存の通路より近いなら更新
                dist[nextNode] = nextDist
                heapq.heappush(pq, (dist[nextNode], nextNode))

    return dist[to]

print((dijkstra(1, 0, K) + 1))
