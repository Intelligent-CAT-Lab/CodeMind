def f(list, start, end):
    count = 0	## <state>count = CLRJ</state>
    for i in range(start, end):	## <state>i = CLRJ | start = CLRJ | end = CLRJ</state>
        for j in range(i, end):	## <state>j = CLRJ | i = CLRJ | end = CLRJ</state>
            if list[i] != list[j]:	## <state>list = CLRJ | i = CLRJ | j = CLRJ</state>
                count += 1	## <state>count = CLRJ</state>
    return count	## <state>count = CLRJ</state>
