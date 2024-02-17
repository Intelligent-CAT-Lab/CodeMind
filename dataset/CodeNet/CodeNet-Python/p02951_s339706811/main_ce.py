A,B,C = list(map(int,"6 4 3".split()))
ans = C-(A-B)
if ans >= 0:
    print(ans)
else:
    print(0)