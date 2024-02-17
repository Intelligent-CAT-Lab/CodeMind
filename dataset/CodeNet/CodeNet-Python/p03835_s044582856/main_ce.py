k, s = map(int, "2 2".split())
ans = 0
for x in range(k+1):
    for y in range(k+1):
        z = s - x - y
        if 0 <= z <= k :
            ans += 1
print(ans)