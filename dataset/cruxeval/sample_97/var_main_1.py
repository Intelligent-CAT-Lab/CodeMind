def f(lst):
    lst.clear()	## lst = CLRJ
    for i in lst:	## lst = CLRJ
        if i == 3:
            return False
    else:
        return True