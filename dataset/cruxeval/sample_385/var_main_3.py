def f(lst):
    i = 0	## <state>i = CLRJ</state>
    new_list = []	## <state>new_list = CLRJ</state>
    while i < len(lst):	## <state>i = CLRJ | lst = CLRJ</state>
        if lst[i] in lst[i+1:]:	## <state>lst = CLRJ | i = CLRJ</state>
            new_list.append(lst[i])	## <state>new_list = CLRJ | lst = CLRJ | i = CLRJ</state>
            if len(new_list) == 3:	## <state>new_list = CLRJ</state>
                return new_list	## <state>new_list = CLRJ</state>
        i += 1	## <state>i = CLRJ</state>
    return new_list