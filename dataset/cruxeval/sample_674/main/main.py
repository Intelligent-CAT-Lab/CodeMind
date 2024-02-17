def f(text):
    ls = list(text)
    for x in range(len(ls)-1, -1, -1):
        if len(ls) <= 1: break
        if ls[x] not in 'zyxwvutsrqponmlkjihgfedcba': ls.pop(ls[x])
    return ''.join(ls)