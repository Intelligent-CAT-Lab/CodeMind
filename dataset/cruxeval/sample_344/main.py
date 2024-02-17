def f(list, operation):
    new_list = list[:]
    new_list.sort()
    operation(new_list)
    return list