k = int(eval(input()))

now = 100
cnt = 0
while (now < k):
    now *= 1.01
    now = int(now)
    cnt += 1

print(cnt)