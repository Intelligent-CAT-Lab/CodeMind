L, R, d = map(int, "5 10 2".split())
cnt = 0
for i in range(L, R + 1):
    if i % d == 0:
        cnt += 1
print(cnt)
