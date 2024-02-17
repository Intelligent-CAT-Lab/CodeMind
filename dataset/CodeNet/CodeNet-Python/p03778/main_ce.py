w, a, b = map(int, "3 2 6".split())
if abs(a-b) < w:
    print(0)
else:
    print(abs(a-b) - w)