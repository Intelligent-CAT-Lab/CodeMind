def f(lst):
    lst.clear()	## lst = []
    for i in lst:	## lst = []
        if i == 3:
            return False
    else:
        return True