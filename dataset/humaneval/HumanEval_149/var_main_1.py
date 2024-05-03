def sorted_list_sum(lst):
    lst.sort()	## lst = CLRJ
    new_lst = []	## new_lst = CLRJ
    for i in lst:	## i = CLRJ|lst = CLRJ
        if len(i)%2 == 0:	## i = CLRJ
            new_lst.append(i)	## new_lst = CLRJ|i = CLRJ
    return sorted(new_lst, key=len)	## new_lst = CLRJ
