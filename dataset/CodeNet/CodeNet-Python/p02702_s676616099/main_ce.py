s = "1817181712114"
n = len(s)
memo = [0] * 2019
memo[0] += 1
num = 0
t = 1
for i in reversed(s):
    num += int(i) * t
    num %= 2019
    t *= 10
    t %= 2019
    memo[num] += 1
ans = 0
for p in memo:
    ans += p*(p-1)//2
print(ans)