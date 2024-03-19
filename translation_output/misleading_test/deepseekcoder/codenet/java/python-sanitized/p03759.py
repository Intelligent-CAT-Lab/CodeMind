def p03759():
    a, b, c = map(int, input().split())
    if a - b == b - c:
        print("YES")
    else:
        print("NO")

p03759()