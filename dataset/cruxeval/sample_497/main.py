def f(n):
    b = list(str(n))
    for i in range(2,len(b)): b[i] += '+'
    return b