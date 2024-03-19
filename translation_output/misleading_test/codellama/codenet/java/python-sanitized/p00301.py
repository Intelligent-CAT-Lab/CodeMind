import sys

n = int(sys.stdin.readline())
a = [0] * 15
i = 0

while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

for i in range(i - 1, -1, -1):
    print((a[i] == 0) * "0" + (a[i] > 0) * "+" + (a[i] < 0) * "-" + (i == 0) * "\n")