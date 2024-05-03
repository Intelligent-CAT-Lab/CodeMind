def f(in_list, num):
    in_list.append(num)	## in_list = [] | num = []
    return in_list.index(max(in_list[:-1]))	## in_list = []
