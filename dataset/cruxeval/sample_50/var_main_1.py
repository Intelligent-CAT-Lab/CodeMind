def f(lst):
    lst.clear()	## lst = CLRJ
    lst += [1] * (len(lst) + 1)	## lst = CLRJ
    return lst	## lst = CLRJ
