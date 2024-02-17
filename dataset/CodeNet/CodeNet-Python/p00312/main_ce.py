D, L = map(int,"10 5".split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)
