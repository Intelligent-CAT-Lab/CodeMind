import sys

n = int(input())

# initialize array
array = [[0 for j in range(10)] for i in range(10)]

# count occurrences
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    array[head][tail] += 1

# calculate result
keta = len(str(n))
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[tail][head]

# print result
print(result)