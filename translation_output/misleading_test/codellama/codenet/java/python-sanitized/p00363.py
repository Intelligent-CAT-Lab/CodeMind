import sys

W, H, c = map(int, sys.stdin.readline().split())
x = (W - 1) // 2
y = (H - 1) // 2

for i in range(H):
    for j in range(W):
        if j == 0 and i == 0 or j == 0 and i == H - 1 or j == W - 1 and i == 0 or j == W - 1 and i == H - 1:
            print("+", end="")
        elif j != 0 and j != W - 1 and i == 0 or j != 0 and j != W - 1 and i == H - 1:
            print("-", end="")
        elif i != 0 and i != H - 1 and j == 0 or i != 0 and i != H - 1 and j == W - 1:
            print("|", end="")
        elif j == x and i == y:
            print(c, end="")
        else:
            print(".", end="")
    print()



* If the current position is one of the corners (i.e., (0, 0), (0, H-1), (W-1, 0), or (W-1, H-1)), it prints a "+" character.
* If the current position is on the left or right edge of the grid (i.e., j == 0 or j == W-1), but not on the corners, it prints a "-" character.
* If the current position is on the top or bottom edge of the grid (i.e., i == 0 or i == H-1), but not on the corners, it prints a "|" character.
* If the current position is the center of the grid (i.e., i == y and j == x), it prints the character provided in the input.
* Otherwise, it prints a "." character.