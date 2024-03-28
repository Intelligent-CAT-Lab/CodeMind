import sys

a, b = map(int, sys.stdin.readline().split())

count = 0
for i in range(a, b+1):
    array = [i % 10, i // 10 % 10, i // 100 % 10, i // 1000 % 10, i // 10000 % 10]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1

print(count)