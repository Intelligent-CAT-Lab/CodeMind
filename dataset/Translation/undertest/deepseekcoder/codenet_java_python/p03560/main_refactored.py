class main:
    import heapq
    
    def min_cost(K):
        dp = [float('inf')] * K
        dp[0] = 0
        heap = [(0, i) for i in range(1, min(10, K))]
        heapq.heapify(heap)
    
        while heap:
            c, v = heapq.heappop(heap)
            if c > dp[v]:
                continue
            for i in range(10):
                nextv = (v * 10 + i) % K
                nextc = c + i
                if dp[nextv] > nextc:
                    dp[nextv] = nextc
                    heapq.heappush(heap, (nextc, nextv))
        return dp[0]
    
    print(min_cost(6))