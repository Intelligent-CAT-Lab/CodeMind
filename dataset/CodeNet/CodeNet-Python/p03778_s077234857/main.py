import sys
W,a,b = map(int,input().split())
if W < 0 or W > 100000:
    sys.exit()
if a < 0 or a > 100000:
    sys.exit()
if b < 0 or b > 100000:
    sys.exit()

move = 0
if W + a < b:
    move = b - (W + a)
if W + a > b and W + a < W + b:
    move = 0
if a > b and a < W + b:
    move = 0
if a > W + b and W + a > W + b:
    move = a - (W + b)
print(move)