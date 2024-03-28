class main:
    import heapq
    
    def p03560():
        K = int(input())
        dp = [float('inf')] * K
    
        class Node:
            def __init__(self, to, cost):
                self.to = to
                self.cost = cost
    
        que = [Node(i, i) for i in range(1, min(10, K))]
        heapq.heapify(que, key=lambda x: x.cost - x.to)
    
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
    
        print(dp[0])
    
    if __name__ == '__main__':
        p03560()