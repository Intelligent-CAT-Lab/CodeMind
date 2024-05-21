import heapq

def main():
    K = int(input())
    dp = [float('inf')] * K

    for i in range(1, min(10, K)):
        dp[i] = i
        heapq.heappush(dp, (i, i))

    while dp:
        node = heapq.heappop(dp)
        v, c = node
        if c > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(dp, (nextv, nextc))

    print(dp[0])

if __name__ == "__main__":
    main()