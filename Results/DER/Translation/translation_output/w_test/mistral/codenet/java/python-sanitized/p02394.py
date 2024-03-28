import sys

W, H, x, y, r = map(int, sys.stdin.readline().split())

if (x - r) >= 0 and (x + r) <= W:
    if ((y - r) >= 0 and (y + r) <= H):
        judge = "Yes"
    else:
        judge = "No"
else:
    judge = "No"

print(judge)