def f(x):
    n = len(x)
    i = 0
    while i < n and x[i].isdigit():
        i += 1
    return i == n