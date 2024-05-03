def f(n):
    for i in str(n):	## i = [] | n = []
        if not i.isdigit():	## i = []
            n = -1	## n = []
            break
    return n	## n = []
