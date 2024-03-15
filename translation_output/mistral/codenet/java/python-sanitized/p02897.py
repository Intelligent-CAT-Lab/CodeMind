import sys

n = float(input())

odd = 0
notOdd = 0
for i in range(1, n+1):
    if i % 2 == 0:
        notOdd += 1
    else:
        odd += 1
print(odd/n)