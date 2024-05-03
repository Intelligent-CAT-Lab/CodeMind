def f(list):
    for i in range(len(list) - 1, 0, -1):	## <state>i = CLRJ | list = CLRJ</state>
        for j in range(i):	## <state>j = CLRJ | i = CLRJ</state>
            if list[j] > list[j + 1]:	## <state>list = CLRJ | j = CLRJ</state>
                list[j], list[j + 1] = list[j + 1], list[j]	## <state>list = CLRJ | j = CLRJ</state>
                list.sort()	## <state>list = CLRJ</state>
    return list	## <state>list = CLRJ</state>
