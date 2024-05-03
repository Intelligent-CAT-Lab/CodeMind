def sum_squares(lst):
    result =[]	## result = CLRJ
    for i in range(len(lst)):	## i = CLRJ|lst = CLRJ
        if i %3 == 0:	## i = CLRJ
            result.append(lst[i]**2)	## result = CLRJ|lst = CLRJ|i = CLRJ
        elif i % 4 == 0 and i%3 != 0:	## i = CLRJ
            result.append(lst[i]**3)
        else:
            result.append(lst[i])	## result = CLRJ|lst = CLRJ|i = CLRJ
    return sum(result)	## result = CLRJ
