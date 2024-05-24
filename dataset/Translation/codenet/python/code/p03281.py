n = int(input())

def cnt_divisor(n):
    cnt = 0
    for i in range(1, n+1):
        if n % i == 0:
            cnt += 1
    return cnt

cnt = 0
for j in range(1, n+1):
    if j % 2 == 0:
        continue
    if cnt_divisor(j) == 8:
        cnt += 1

print(cnt)
