def f(a, b):
    a.sort()
    b.sort(reverse=True)
    return a + b
f([666], [])