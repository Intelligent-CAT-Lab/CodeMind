import sys

count = [0, 0, 0, 0, 0]

for i in range(5):
    x = int(sys.stdin.readline())
    count[i] += x

for i in range(5):
    if count[i] == 0:
        print(i + 1)

/atcoder/ABC170/ABC170_C.md
# ABC170_C