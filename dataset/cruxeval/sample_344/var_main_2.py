def f(list, operation):
    new_list = list[:]	## new_list = [] | list = []
    new_list.sort()	## new_list = []
    operation(new_list)
    return list