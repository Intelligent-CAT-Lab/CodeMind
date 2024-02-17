a, b, c = map(int, "10 30 20".split())
if a == b + c:
    print('Yes')
elif a + b == c:
    print('Yes')
elif a + c == b:
    print('Yes')
else:
    print('No')