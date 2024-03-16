import sys

s1 = input()
won = 0
lose = 0
g = 0
p = 0

for i in range(len(s1)):
    if s1[i] == 'g':
        if p == g:
            g += 1
        else:
            p += 1
            won += 1
    elif s1[i] == 'p':
        if p == g:
            g += 1
            lose += 1
        else:
            p += 1

print(won - lose)