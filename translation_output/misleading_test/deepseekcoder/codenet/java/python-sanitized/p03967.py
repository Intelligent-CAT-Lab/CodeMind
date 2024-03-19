import sys

def p03967():
    top = sys.stdin.readline().strip()
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

p03967()