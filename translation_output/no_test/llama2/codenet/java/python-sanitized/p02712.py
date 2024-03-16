import sys

S = int(sys.stdin.readline())
list = [0] * (S + 1)
ans = 0
for i in range(2, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        continue
    ans += i
list[S] = ans
for i in range(S, 0, -1):
    if list[i] == 0:
        continue
    ans += list[i]
    list[i] = 0
print(ans)