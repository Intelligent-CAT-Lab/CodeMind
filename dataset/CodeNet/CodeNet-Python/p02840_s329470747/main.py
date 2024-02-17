# Sum Difference
from collections import defaultdict
N, X, D = map(int, input().split())
if D < 0:
    X, D = -X, -D

if D == 0:
    Sets = set()
    for i in range(N+1):
        Sets.add(i*X)
    print(len(Sets))
    exit()

# D>0
ans = 0
Mode = defaultdict(list)
for i in range(N+1):
    L = (i*X+D*i*(i-1)//2-i*X % D)//D
    R = (i*X+D*i*(2*N-1-i)//2-i*X % D)//D
    Mode[i*X % D].append((L, 1))
    Mode[i*X % D].append((R+1, -1))
Data = []
for key in Mode.keys():
    Mode[key].sort()
    cnt = 1
    sums = Mode[key][0][0]
    for num, which in Mode[key][1:]:
        Data.append((sums, num, cnt))
        cnt += which
        sums = num
ans = 0
for l, r, v in Data:
    if v > 0:
        ans += r-l
print(ans)