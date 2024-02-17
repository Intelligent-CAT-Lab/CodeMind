def f(n):
    for i in str(n):
        if not i.isdigit():
            n = -1
            break
    return n