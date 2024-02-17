def f(s, c1, c2):
    if s == '':
        return s
    ls = s.split(c1)
    for index, item in enumerate(ls):
        if c1 in item:
            ls[index] = item.replace(c1, c2, 1)
    return c1.join(ls)