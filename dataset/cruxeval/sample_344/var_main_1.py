def f(list, operation):
    new_list = list[:]	## new_list = CLRJ | list = CLRJ
    new_list.sort()	## new_list = CLRJ
    operation(new_list)
    return list