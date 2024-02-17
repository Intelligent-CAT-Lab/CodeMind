N, K=map(int, input().split())
count = 0

for b in range(K+1,N+1):

  count += (b-K)*(N//b) + max(0, (N%b) - K +1)
  
if K == 0:
  count = N*N

  
print(count)