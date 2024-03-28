import sys

input_vals = sys.stdin.readline().rstrip().split()
h, w, x, y = map(int, input_vals)

if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")