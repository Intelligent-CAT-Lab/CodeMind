r, g, b = list(map(int, input().split()))

if (g * 10 + b) % 4 == 0:
    print("YES")
else:
    print("NO")
