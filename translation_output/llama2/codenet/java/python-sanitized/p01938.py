import sys

a = sys.stdin.readline().strip()

a = list(a)

sum = 0

for i in range(len(a)):
    if a[i] <= 'A':
        sum += 1

print(sum)