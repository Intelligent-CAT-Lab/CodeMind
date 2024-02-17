m, f, b = map(int, "1000 3000 3000".split())
if b <= m:
    print(0)
elif b <= m + f:
    print(b - m)
else:
    print("NA")
