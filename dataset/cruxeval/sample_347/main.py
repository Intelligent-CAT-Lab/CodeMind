def f(text):
    ls = list(text)
    length = len(ls)
    for i in range(length):
        ls.insert(i, ls[i])
    return ''.join(ls).ljust(length * 2)