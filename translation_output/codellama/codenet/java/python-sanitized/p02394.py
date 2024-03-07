import sys

# å
¥å
br = sys.stdin.readline().split()
W, H, x, y, r = map(int, br)

# å¤å®å¦ç
if (x - r) >= 0 and (x + r) <= W:
    if (y - r) >= 0 and (y + r) <= H:
        judge = "Yes"
    else:
        judge = "No"
else:
    judge = "No"

# åºå
print(judge)