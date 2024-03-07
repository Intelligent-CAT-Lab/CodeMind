import sys

x = [int(i) for i in sys.stdin.readline().split()]
sum = 0
for i in range(5):
    sum += x[i]
print(15 - sum)