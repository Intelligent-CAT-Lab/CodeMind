N, x = [int(i) for i in "4 4".split()]
import sys
if x == 1 or x == 2*N-1:
    if N != 1:
        print('No')
        sys.exit()
    else:
        print('Yes')
        print(1)
        sys.exit()
smaller = True
if x > N:
    smaller = False
    x = 2*N-x
ans = list(range(2*N-1,N+x-1,-1))+list(range(1,N+x))
if not smaller:
    ans =[2*N - ans[i] for i in range(2*N-1)]
print('Yes')
for i in range(2*N-1):
    print(ans[i])