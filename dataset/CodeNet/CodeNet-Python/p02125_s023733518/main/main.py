n = int(eval(input()))
cnt = 0
n += 1

while 1:
    n //= 2
    cnt += 1
    if n == 1:
        break

print(cnt)

