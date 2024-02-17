def f(text, sub):
    index = []
    starting = 0
    while starting != -1:
        starting = text.find(sub, starting)
        if starting != -1:
            index.append(starting)
            starting += len(sub)
    return index