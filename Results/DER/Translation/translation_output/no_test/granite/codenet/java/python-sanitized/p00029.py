import sys

s = []
index = 0
for line in sys.stdin:
    s.append(line.strip())
    index += 1

r = [0] * index
flag = [True] * 2002
for i in range(index):
    for j in range(i + 1, index):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_count = 0
max_index = 0
for i in range(index):
    if max_count < r[i]:
        max_count = r[i]
        max_index = i

print(s[max_index], end=' ')

max_length = 0
max_index = 0
for i in range(index):
    if len(s[max_index]) < len(s[i]):
        max_index = i

print(s[max_index])