def f(line):
    a = []
    for c in line:
        if c.isalnum():
            a.append(c)
    return ''.join(a)