def f(seq, v):
    a = []
    for i in seq:
        if i.endswith(v):
            a.append(i*2)
    return a