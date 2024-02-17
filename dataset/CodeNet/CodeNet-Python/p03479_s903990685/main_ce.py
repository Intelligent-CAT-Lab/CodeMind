x, y = map(int ,"3 20".split())
ans = 0
while x <= y:
    ans += 1
    x *= 2
print(ans)