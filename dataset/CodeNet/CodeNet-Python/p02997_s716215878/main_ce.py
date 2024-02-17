#maspyさんの神解答
import itertools
N,K = map(int,"5 3".split())
x = (N-1)*(N-2)//2
if x < K:
    print(-1)
    exit()
edge = [(1,n) for n in range(2,N+1)]
edge += list(itertools.combinations(range(2,N+1),2))[:x-K]
print(len(edge))
for x,y in edge:
    print(x,y)