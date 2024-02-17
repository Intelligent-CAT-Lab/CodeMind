def val(x):
    sum = 0
    while x > 0:
        sum += x%10
        x //= 10
    return sum

a,n,m = list(map(int, input().split()))
cnt = 0

for y in range(1, 73):
    x = 1
    for t in range(1, n+1):
      x *= (y+a)
    if x <= m and val(x) == y:
        cnt += 1

print(cnt)
