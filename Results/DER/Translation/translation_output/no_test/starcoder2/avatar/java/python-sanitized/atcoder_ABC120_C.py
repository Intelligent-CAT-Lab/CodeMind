/atcoder/ABC120/ABC120_C.py
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    e
print(ans * 2)
lse:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1
        /atcoder/ABC120/ABC120_B.py
a, b, k = map(int, input().split())

ans = 0

for i in range(100, 0, -1):
    if a % i == 0 and b % i == 0:
        ans += 1
        if ans == k:
            print(i)
            break
/atcoder/ABC120/ABC120_A.py
t().split())

if a * b <= c:
    print(b)
else:
    print(c // a)
a, b, c = map(int, raw_input().spli/atcoder/ABC120/ABC120_D.py
n, m = map(int, input().split())

ans = [0] * m

for i in range(m):
    a, b = map(int, input().split())
    ans[i] = (a, b)

print(ans)