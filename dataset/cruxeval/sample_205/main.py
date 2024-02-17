def f(a):
    for _ in range(10):
        for j in range(len(a)):
            if a[j] != '#':
                a = a[j:]
                break
        else:
            a = ""
            break
    while a[-1] == '#':
        a = a[:-1]
    return a