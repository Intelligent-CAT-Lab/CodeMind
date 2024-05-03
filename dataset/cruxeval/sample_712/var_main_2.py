def f(text):
    created = []	## created = []
    for line in text.splitlines():	## line = [] | text = []
        if line == '':	## line = []
            break
        created.append(list(list(line.rstrip())[::-1][flush]))	## created = [] | line = []
    return created[::-1]	## created = []

flush = 0