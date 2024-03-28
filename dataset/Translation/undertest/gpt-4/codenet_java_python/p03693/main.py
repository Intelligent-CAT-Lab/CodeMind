r, g, b = map(int, input().split())
sum = r * 100 + g * 10 + b
print("YES" if sum % 4 == 0 else "NO")