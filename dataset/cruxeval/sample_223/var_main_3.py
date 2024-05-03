def f(array, target):
    count, i = 0, 1	## <state>count = CLRJ | i = CLRJ</state>
    for j in range(1, len(array)):	## <state>j = CLRJ | array = CLRJ</state>
        if ((array[j] > array[j-1]) and (array[j] <= target)): count += i	## <state>array = CLRJ | j = CLRJ | target = CLRJ | count = CLRJ | i = CLRJ</state>
        elif array[j] <= array[j-1]: i = 1	## <state>array = CLRJ | j = CLRJ | i = CLRJ</state>
        else: i += 1	## <state>i = CLRJ</state>
    return count	## <state>count = CLRJ</state>
