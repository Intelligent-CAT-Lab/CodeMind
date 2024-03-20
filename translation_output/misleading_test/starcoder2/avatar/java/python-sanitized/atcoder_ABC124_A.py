a, b = map(int, input().split())
if a == b:
    print(a * 2)
elif a > b:
    print(a * 2 - 1)
else:
    print(b * 2 - 1)