def f(n, m, num):
    x_list = list(range(n, m+1))	## x_list = CLRJ | n = CLRJ | m = CLRJ
    j = 0	## j = CLRJ
    while True:
        j = (j + num) % len(x_list)	## j = CLRJ | num = CLRJ | x_list = CLRJ
        if x_list[j] % 2 == 0:	## x_list = CLRJ | j = CLRJ
            return x_list[j]	## x_list = CLRJ | j = CLRJ
