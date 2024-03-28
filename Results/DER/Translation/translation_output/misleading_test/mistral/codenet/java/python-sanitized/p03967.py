import sys

top = input()
score = 0
for j in range(len(top)):
    if top[j] == 'g' and top[j-1] == 'p':
        score += 1
    elif top[j] == 'p':
        score -= 1

print(score)