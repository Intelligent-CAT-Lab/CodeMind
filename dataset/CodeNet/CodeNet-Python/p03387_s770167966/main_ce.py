A, B, C = map(int, "2 5 4".split())
m = max(A, B, C)
ans = 0
ans += (m-A)//2
A += (m-A)//2*2
ans += (m-B)//2
B += (m-B)//2*2
ans += (m-C)//2
C += (m-C)//2*2
s = sum([a == m for a in (A, B, C)])
if s == 3:
    pass
elif s == 1:
    ans += 1
else:
    ans += 2
print(ans)
