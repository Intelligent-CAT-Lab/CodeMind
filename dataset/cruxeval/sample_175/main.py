def f(s, amount):
    lines = s.splitlines()
    w = max(map(lambda l: l.rfind(' '), lines))
    ls = [[l, (w + 1) * amount - l.rfind(' ')] for l in lines]
    for i, line in enumerate(ls):
        ls[i][0] = line[0] + ' ' * line[1]
    return '\n'.join(map(lambda l: l[0], ls))