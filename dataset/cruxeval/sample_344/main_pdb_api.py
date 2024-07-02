def f(list, operation):
    new_list = list[:]
    new_list.sort()
    operation(new_list)
    return list
f([6, 4, 2, 8, 15], (lambda x: x.reverse()))