from collections import defaultdict

s = []
index = 0

# Instead of a while-loop, we use a for-loop over the input lines
try:
    while True:
        str_input = input().split()
        for str in str_input:
            s.append(str)
            index += 1
except EOFError:
    pass

r = [0] * index
flag = [True] * (index + 1)

fre = 0
for i in range(index):
    for j in range(i + 1, index):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_count = 0
maxin = 0
for i in range(index):
    if max_count < r[i]:
        max_count = r[i]
        maxin = i

print(s[maxin], end=" ")

longest_index = max(range(index), key=lambda i: len(s[i]))
print(s[longest_index])