a, b, c = map(int, input().split())
print("YES" if any((a * i) % b == c for i in range(1, b+1)) else "NO")