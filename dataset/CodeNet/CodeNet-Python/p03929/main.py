n,k=map(int, input().split())

#11段で1周するのでそこまで計算する
r=[]
for i in range(1,12):
    m=0
    for j in range(1,6):
        t = 0
        for x in range(3):
            for y in range(3):
                t += 7*(i+y) + (j+x) - 7
        if t % 11 == k: m += 1
    r.append(m)

a,b=divmod(n,11)
ans = 0
ans += a*sum(r)
if b < 1: ans -= r[-2]
if b < 2: ans -= r[-1]
if b >= 3:
    for i in range(b-2): ans += r[i]
print(ans)