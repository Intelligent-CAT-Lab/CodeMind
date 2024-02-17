def f(string):
    l = list(string)
    for i in reversed(list(range(len(l)))):
        if l[i] != ' ':
            break
        l.pop(i)
    return ''.join(l)