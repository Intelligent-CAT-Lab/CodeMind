def f(lst):
    lst[1:4] = lst[1:4][::-1]
    return lst