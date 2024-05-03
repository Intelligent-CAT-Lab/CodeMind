def choose_num(x, y):
    if x > y:	## x = CLRJ|y = CLRJ
        return -1
    if y % 2 == 0:	## y = CLRJ
        return y
    if x == y:	## x = CLRJ|y = CLRJ
        return -1
    return y - 1	## y = CLRJ
