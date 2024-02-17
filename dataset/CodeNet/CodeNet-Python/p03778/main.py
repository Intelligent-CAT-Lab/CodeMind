w, a, b = map(int, input().split())

if abs(a-b) < w:
    print(0)
else:
    print(abs(a-b) - w)