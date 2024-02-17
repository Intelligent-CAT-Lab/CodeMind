def f(text):
    s = 0
    for i in range(1, len(text)):
        s += len(text.rpartition(text[i])[0])
    return s