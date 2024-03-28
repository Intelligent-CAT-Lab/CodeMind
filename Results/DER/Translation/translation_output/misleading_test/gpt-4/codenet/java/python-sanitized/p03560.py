from queue import PriorityQueue

def find_least_sum_mod_k(K):
    dp = [float('inf')] * K
    pq = PriorityQueue()

    class Node:
        def __init__(self, to, cost):
            self.to = to
            self.cost = cost
        
        def __lt__(self, other):
            return self.cost < other.cost
    
    for i in range(1, min(10, K)):
        dp[i] = i
        pq.put(Node(i, i))
    
    while not pq.empty():
        node = pq.get()
        v = node.to
        c = node.cost
        if c > dp[v]:
            continue
        
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                pq.put(Node(nextv, nextc))

    return dp[0]

# Test input
K = 6

# Expected output: 47
print(find_least_sum_mod_k(K))