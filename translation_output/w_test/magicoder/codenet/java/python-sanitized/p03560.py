import heapq

def min_cost(K):
    dp = [float('inf')] * K
    dp[0] = 0
    heap = [(0, 0)]
    while heap:
        cost, v = heapq.heappop(heap)
        if cost > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = cost + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(heap, (nextc, nextv))
    return dp[0]

K = int(input())
print(min_cost(K))