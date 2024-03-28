import sys

r, g, b = map(int, sys.stdin.readline().split())

print("YES" if (r + g + b) % 4 == 0 else "NO")