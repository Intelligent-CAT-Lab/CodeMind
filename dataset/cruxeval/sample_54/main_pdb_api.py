def f(text, s, e):
    sublist = text[s:e]
    if not sublist:
        return -1
    return sublist.index(min(sublist))
f('happy', 0, 3)