import sys

X = sys.stdin.readline().strip()
sb = ""
for i in range(len(X)):
    if i == 4:
        sb += " " + X[i]
    else:
        sb += X[i]

print(sb)