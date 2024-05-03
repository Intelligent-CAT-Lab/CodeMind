def tri(n):
    if n == 0:	## n = CLRJ
        return [1]
    my_tri = [1, 3]	## my_tri = CLRJ
    for i in range(2, n + 1):	## i = CLRJ|n = CLRJ
        if i % 2 == 0:	## i = CLRJ
            my_tri.append(i / 2 + 1)	## my_tri = CLRJ|i = CLRJ
        else:
            my_tri.append(my_tri[i - 1] + my_tri[i - 2] + (i + 3) / 2)	## my_tri = CLRJ|i = CLRJ
    return my_tri	## my_tri = CLRJ
