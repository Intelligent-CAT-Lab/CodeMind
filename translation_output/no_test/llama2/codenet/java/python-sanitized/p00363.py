import sys

W, H = map(int, sys.stdin.readline().split())
c = sys.stdin.readline()

for i in range(H):
    for j in range(W):
        if j == 0 or j == W - 1 or i == 0 or i == H - 1:
            print("+", end="")
        elif j != 0 and j != W - 1 and i == 0 or j != 0 and j != W - 1 and i == H - 1:
            print("-", end="")
        elif i != 0 and i != H - 1 and j == 0 or i != 0 and i != H - 1 and j == W - 1:
            print("|", end="")
        elif j == W // 2 and i == H // 2:
            print(c, end="")
        else:
            print(".", end="")
    print()