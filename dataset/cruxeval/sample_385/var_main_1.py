def f(lst):
    i = 0	## i = CLRJ
    new_list = []	## new_list = CLRJ
    while i < len(lst):	## i = CLRJ | lst = CLRJ
        if lst[i] in lst[i+1:]:	## lst = CLRJ | i = CLRJ
            new_list.append(lst[i])	## new_list = CLRJ | lst = CLRJ | i = CLRJ
            if len(new_list) == 3:	## new_list = CLRJ
                return new_list	## new_list = CLRJ
        i += 1	## i = CLRJ
    return new_list