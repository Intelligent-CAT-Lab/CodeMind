import sys

list = sys.stdin.readline().strip()
a = 'A'
sum = 0
for i in range(len(list)):
    if list[i] <= a:
        sum += 1
    a = list[i]
print(sum)

/2019-09-16/README.md
# 2019-09-16