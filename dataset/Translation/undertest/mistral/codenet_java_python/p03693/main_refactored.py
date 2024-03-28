class main:
    r, g, b = map(int, input().split())
    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")