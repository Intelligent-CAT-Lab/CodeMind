> Translate the following python code to java and enclose your solution inside :

import heapq

K = int(input())

edge = [[] for i in range(K)]  # (node, cost) list list

for i in range(1, K):
    edge[i].append(( (i+1)%K, 1) )
    edge[i].append( ((i*10)%K, 0) )

# fro ãã to ã¸ã®æç­è·é¢(v ã¯é ç¹æ°)
def dijkstra(fro, to, v):
    MAX = int(1e9)

    dist = [MAX]*v   # fro ããã®è·é¢ãæ ¼ç´ãã
    check = [False]*v  # ãã§ã«ãã®é ç¹ãããèª¿ã¹ããã®ãã©ã°

    dist[fro] = 0
    pq = [(0, fro)]    # (-cost, node)


    # é ç¹ã¯ v åããã®ã§ãv å¨ãã
    for i in range(v):
        # èª¿ã¹æ¸ã¿ã§ãªãé ç¹ã®ãã¡ãæãè¿ãé ç¹ã now ã«å
¥ãã
        nowNode = -1        # ãã®ã¿ã¼ã³ã«ãã©ã¼ã«ã¹ãããã¼ã

        while True:
            nowNode = heapq.heappop(pq)[1]  # æå°ã³ã¹ãããè²ªæ¬²ã«åã£ã¦ãã
            if not check[nowNode]:    # ã¾ã ãã§ãã¯ããã¦ããªããã¼ãã ã£ããæ±ºå®
                check[nowNode] = True
                break

        # ãã®é ç¹ãããã©ãçããé ç¹ã®æ
å ±ãæ´æ°ãã
        for (nextNode, cost) in edge[nowNode]:
            nextDist = dist[nowNode] + cost
            if nextDist < dist[nextNode]:  # æ¢å­ã®éè·¯ããè¿ããªãæ´æ°
                dist[nextNode] = nextDist
                heapq.heappush(pq, (dist[nextNode], nextNode))

    return dist[to]

print(dijkstra(1, 0, K) + 1)