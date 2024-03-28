s1 = input().strip().split()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)