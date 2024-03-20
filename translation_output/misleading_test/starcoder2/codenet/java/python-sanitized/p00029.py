import sys

s = sys.stdin.read().split()

r = [0] * len(s)
flag = [True] * len(s)

for i in range(len(s)):
    for j in range(i + 1, len(s)):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_index = 0
max_value = 0
for i in range(len(s)):
    if max_value < r[i]:
        max_value = r[i]
        max_index = i

print(s[max_index], end=' ')

max_index = 0
max_value = 0
for i in range(len(s)):
    if max_value < len(s[i]):
        max_value = len(s[i])
        max_index = i

print(s[max_index])