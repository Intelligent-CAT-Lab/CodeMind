import fractions
import sys
def lcm(a,b):
    return a * b // fractions.gcd(a,b)
N = int("2")
if N == 2:
    print ("4 7")
    print ("23 10")
    sys.exit()
lis = [2]
now = 3
while len(lis) <= 2 * N:
    flag = True
    for i in lis:
        if now % i == 0:
            flag = False
            break
    if flag:
        lis.append(now)
    now += 2
#print (lis)
ans = [ [1] * N for i in range(N) ]
for i in range(N):
    for j in range(N):
        if (i + j) % 2 == 0:
            ans[i][j] *= lis[(i+j) // 2]
if N % 2 == 1:
    for i in range(N):
        for j in range(N):
            if (i + abs(N-1 - j)) % 2 == 0:
                ans[i][j] *= lis[ -1 - (i + abs(N-1 - j)) // 2 ]
else:
    for i in range(N):
        for j in range(N):
            if (i + abs(N-1 - j)) % 2 == 1:
                ans[i][j] *= lis[ -1 - ((i + abs(N-1 - j) -1 ) // 2)]
#for i in range(N):
#    print (" ".join(map(str,ans[i])))
for i in range(N):
    for j in range(N):
        if (i + j) % 2 == 1:
            t = 1
            if i > 0:
                t = lcm(t,ans[i-1][j])
            if j > 0:
                t = lcm(t,ans[i][j-1])
            if i < N-1:
                t = lcm(t,ans[i+1][j])
            if j < N-1:
                t = lcm(t,ans[i][j+1])
            ans[i][j] = t+1
for i in range(N):
    print (" ".join(map(str,ans[i])))
