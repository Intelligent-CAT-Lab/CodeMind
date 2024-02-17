s = ''
c1 = 'mi'
c2 = 'siast'
if s == '':
    print(s)
else:
    ls = s.split(c1)
    for index, item in enumerate(ls):
        if c1 in item:
            ls[index] = item.replace(c1, c2, 1)
    print(c1.join(ls))