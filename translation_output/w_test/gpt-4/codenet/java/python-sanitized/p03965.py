s1 = input().strip()
won = 0
lose = 0
g = 0
p = 0

for char in s1:
    if char == 'g':
        if p == g:
            g += 1
        elif p < g:
            p += 1
            won += 1
    elif char == 'p':
        if p == g:
            g += 1
            lose += 1
        elif p < g:
            p += 1
        else:
            g += 1
            lose += 1

print(won - lose)