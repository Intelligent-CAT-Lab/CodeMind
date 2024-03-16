import math
import sys

n, k = map(int, input().split())
x0 = int(input())

if x0 == 0:
    print(0)
    sys.exit()

x = x0
s = 10000
count = [0] * s
offset = 2 ** 63
M = s / (2 ** 64)

for i in range(n):
    at = int((x + offset) * M)
    if at < 0:
        at = 0
    if at >= s:
        at = s - 1
    count[at] += 1
    x ^= x << 13
    x ^= x >> 7
    x ^= x << 17

sum = 0
length = -1
target = -1
for i in range(s):
    if sum <= k and k < sum + count[i]:
        target = i
        length = count[i]
        break
    sum += count[i]

now = 0
is = [0] * length
x = x0
for i in range(n):
    at = int((x + offset) * M)
    if at < 0:
        at = 0
    if at >= s:
        at = s - 1
    if at == target:
        is[now] = x
        now += 1
    x ^= x << 13
    x ^= x >> 7
    x ^= x << 17

is.sort()
print(is[k - sum])