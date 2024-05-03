def f(in_list, num):
    in_list.append(num)	## in_list = CLRJ | num = CLRJ
    return in_list.index(max(in_list[:-1]))	## in_list = CLRJ
