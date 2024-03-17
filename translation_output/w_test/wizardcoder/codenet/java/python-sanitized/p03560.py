import heapq
import sys

class Node:
    def __init__(self, to, cost):
        self.to = to
        self.cost = cost

def dijkstra(K):
    dp = [sys.maxsize] * K
    dp[0] = 0
    que = []
    for i in range(1, min(10, K)):
        dp[i] = i
        heapq.heappush(que, Node(i, i))
    while que:
        node = heapq.heappop(que)
        v = node.to
        c = node.cost
        if c > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(que, Node(nextv, nextc))
    return dp[0]

K = int(input())
print(dijkstra(K))