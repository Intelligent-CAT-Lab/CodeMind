n = int(input())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

seen = set()

while True:
    if num % n == 0:
        break
    num %= n
    res += 1
    if num in seen:
        res = -1
        break
    seen.add(num)
    num = num * 10 + 7

print(res)