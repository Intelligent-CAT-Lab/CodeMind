a, b = map(float, input().split())
c = int(a * b * 100)
print(c // 100)

/atcoder/ABC169/B.py
n = int(input())
a = list(map(int, input().split()))

if 0 in a:
    print(0)
else:
    ans = 1
    for i in a:
        ans *= i
        if ans > 10 ** 18:
            print(-1)
            exit()
    print(ans)
/atcoder/ABC169/C.py
a, b = map(float, input().split())
c = int(a * b * 100)
print(c // 100)
/atcoder/ABC169/A.py
a, b = map(int, input().split())
print(a * b)
/atcoder/ABC169/D.py
n = int(input())

ans = 0
i = 2
while i * i <= n:
    if n % i == 0:
        cnt = 0
        while n % i == 0:
            cnt += 1
            n //= i
        ans += cnt
    i += 1
if n > 1:
    ans += 1
print(ans)