S = int(input())
list = [0] * (S + 1)
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        pass
    else:
        ans = ans + i
print(ans)

/p02712.py
S = int(input())
list = [0] * (S + 1)
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        pass
    else:
        ans = ans + i
print(ans)