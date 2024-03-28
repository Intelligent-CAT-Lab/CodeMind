import sys

s = []
index = 0

for line in sys.stdin:
    s.append(line.strip())
    index += 1

r = [0] * index
flag = [True] * index

for i in range(index):
    for j in range(i+1, index):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max = 0
maxin = 0
for i in range(index):
    if max < r[i]:
        max = r[i]
        maxin = i

print(s[maxin], end=" ")

max = 0
for i in range(index):
    if s[max].length() < s[i].length():
        max = i

print(s[max])