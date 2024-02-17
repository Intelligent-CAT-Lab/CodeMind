def f(lst):
    lst.clear()
    lst += [1] * (len(lst) + 1)
    return lst