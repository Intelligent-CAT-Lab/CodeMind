n = int("4")
s = []
for i in range(1 << n):
    s.append(f'{i}:')
    for j in range(n):
        if i & 1 << j:
            s.append(f' {j}')
    s.append('\n')
print(''.join(s), end='')
