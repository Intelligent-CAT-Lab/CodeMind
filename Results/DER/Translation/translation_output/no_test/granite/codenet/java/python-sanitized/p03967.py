import sys

top = sys.stdin.readline()
cpp = False
score = 0
for j in range(len(top)):
    if cpp:
        if top[j] == 'g':
            score += 1
        cpp = False
    else:
        if top[j] == 'p':
            score -= 1
        cpp = True
print(score)