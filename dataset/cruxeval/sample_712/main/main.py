def f(text):
    created = []
    for line in text.splitlines():
        if line == '':
            break
        created.append(list(list(line.rstrip())[::-1][flush]))
    return created[::-1]

flush = 0