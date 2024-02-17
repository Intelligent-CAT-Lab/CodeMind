text = 'A(hiccup)A'
created = []
flush = 0
for line in text.splitlines():
    if line == '':
        break
    created.append(list(list(line.rstrip())[::-1][flush]))
print(created[::-1])