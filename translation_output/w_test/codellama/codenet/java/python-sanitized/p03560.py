import heapq

def main():
    K = int(input())
    dp = [float('inf')] * K
    dp[0] = 0
    que = [(0, 0)]
    while que:
        v, c = heapq.heappop(que)
        if c > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(que, (nextv, nextc))
    print(dp[0])

if __name__ == '__main__':
    main()