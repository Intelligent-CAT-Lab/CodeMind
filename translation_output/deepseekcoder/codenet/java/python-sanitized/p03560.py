import heapq

def main():
    K = int(input())
    dp = [float('inf')] * K
    dp[0] = 0

    class Node:
        def __init__(self, to, cost):
            self.to = to
            self.cost = cost

        def __lt__(self, other):
            return self.cost < other.cost

    que = []
    for i in range(1, min(10, K)):
        dp[i] = i
        que.append(Node(i, i))

    heapq.heapify(que)

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
                que.append(Node(nextv, nextc))

    print(dp[0])

if __name__ == "__main__":
    main()