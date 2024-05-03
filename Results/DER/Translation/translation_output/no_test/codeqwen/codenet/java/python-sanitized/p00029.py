import sys

s = []
for line in sys.stdin:
    s.append(line.strip())

r = [0] * len(s)
flag = [True] * len(s)
for i in range(len(s)):
    for j in range(i+1, len(s)):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_index = r.index(max(r))
print(s[max_index], end=" ")

max_length = max(len(word) for word in s)
for word in s:
    if len(word) == max_length:
        print(word)