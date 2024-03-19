import sys

# Read input
work = sys.stdin.readline().split()
W, H, x, y, r = map(int, work)

# Check if the point is within the circle
if x - r >= 0 and x + r <= W and y - r >= 0 and y + r <= H:
    print("Yes")
else:
    print("No")