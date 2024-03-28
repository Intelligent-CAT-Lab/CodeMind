import sys

top = sys.stdin.readline()
cpp = False
score = 0
for i in range(len(top)):
    if cpp:
        if top[i] == 'g':
            score += 1
        cpp = False
    else:
        if top[i] == 'p':
            score -= 1
        cpp = True

print(score)