def strange_sort_list(lst):
    res, switch = [], True	## res = CLRJ|switch = CLRJ
    while lst:	## lst = CLRJ
        res.append(min(lst) if switch else max(lst))	## res = CLRJ|switch = CLRJ|lst = CLRJ
        lst.remove(res[-1])	## lst = CLRJ|res = CLRJ
        switch = not switch	## switch = CLRJ
    return res	## res = CLRJ
