import heapq

K = int(input())
dp = [float('inf')]*K

for i in range(1,min(10,K)):
    dp[i] = i
    heapq.heappush(que,(i,i))

while que:
    c,v = heapq.heappop(que)
    if c > dp[v]:
        continue
    for i in range(10):
        nextv = (v*10+i)%K
        nextc = c+i
        if dp[nextv] > nextc:
            dp[nextv] = nextc
            heapq.heappush(que,(nextc,nextv))

print(dp[0])