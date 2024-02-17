r, g, b = map(int, "4 3 2".split())
if (g * 10 + b) % 4 == 0:
    print("YES")
else:
    print("NO")
