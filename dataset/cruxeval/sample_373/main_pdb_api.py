def f(orig):
    copy = orig
    copy.append(100)
    orig.pop()
    return copy
f([1, 2, 3])