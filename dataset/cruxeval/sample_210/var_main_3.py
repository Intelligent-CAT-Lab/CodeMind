def f(n, m, num):
    x_list = list(range(n, m+1))	## <state>x_list = CLRJ | n = CLRJ | m = CLRJ</state>
    j = 0	## <state>j = CLRJ</state>
    while True:
        j = (j + num) % len(x_list)	## <state>j = CLRJ | num = CLRJ | x_list = CLRJ</state>
        if x_list[j] % 2 == 0:	## <state>x_list = CLRJ | j = CLRJ</state>
            return x_list[j]	## <state>x_list = CLRJ | j = CLRJ</state>
