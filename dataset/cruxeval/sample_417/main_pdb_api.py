def f(lst):
    lst.reverse()
    lst.pop()
    lst.reverse()
    return lst
f([7, 8, 2, 8])