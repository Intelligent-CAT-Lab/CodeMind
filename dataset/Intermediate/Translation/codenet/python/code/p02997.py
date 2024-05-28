import sys
def MI(): return map(int,sys.stdin.readline().rstrip().split())

N,K = MI()

if K > ((N-1)*(N-2))//2:
    print(-1)
    exit()

print(N-1+((N-1)*(N-2))//2-K)

for i in range(2,N+1):
    print(1,i)

a = 0
for i in range(2,N):
    for j in range(i+1,N+1):
        if a < ((N-1)*(N-2))//2-K:
            print(i,j)
            a += 1
