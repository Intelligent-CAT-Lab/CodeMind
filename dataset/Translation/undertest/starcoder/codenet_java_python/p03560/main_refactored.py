class main:
    import sys
    import heapq
    
    def main():
        K = int(sys.stdin.readline())
        dp = [sys.maxsize for _ in range(K)]
        heap = []
        for i in range(1, min(10, K)):
            dp[i] = i
            heapq.heappush(heap, (i, i))
        while heap:
            v, c = heapq.heappop(heap)
            if c > dp[v]:
                continue
            for i in range(10):
                nextv = (v * 10 + i) % K
                nextc = c + i
                if dp[nextv] > nextc:
                    dp[nextv] = nextc
                    heapq.heappush(heap, (nextv, nextc))
        print(dp[0])
    
    if __name__ == "__main__":
        main()