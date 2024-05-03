def f(array, target):
    count, i = 0, 1	## count = CLRJ | i = CLRJ
    for j in range(1, len(array)):	## j = CLRJ | array = CLRJ
        if ((array[j] > array[j-1]) and (array[j] <= target)): count += i	## array = CLRJ | j = CLRJ | target = CLRJ | count = CLRJ | i = CLRJ
        elif array[j] <= array[j-1]: i = 1	## array = CLRJ | j = CLRJ | i = CLRJ
        else: i += 1	## i = CLRJ
    return count	## count = CLRJ
