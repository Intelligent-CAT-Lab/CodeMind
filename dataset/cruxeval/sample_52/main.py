def f(text):
    a = []
    for i in range(len(text)):
        if not text[i].isdecimal():
            a.append(text[i])
    return ''.join(a)