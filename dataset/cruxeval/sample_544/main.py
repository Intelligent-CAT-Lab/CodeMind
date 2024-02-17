def f(text):
    a = text.split('\n')
    b = []
    for i in range(len(a)):
        c = a[i].replace('\t', '    ')
        b.append(c)
    return '\n'.join(b)