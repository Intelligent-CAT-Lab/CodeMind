def f(lst):
    new = list()	## <state>new = CLRJ</state>
    i = len(lst)-1	## <state>i = CLRJ | lst = CLRJ</state>
    for _ in range(len(lst)):	## <state>_ = CLRJ | lst = CLRJ</state>
        if i%2 == 0:	## <state>i = CLRJ</state>
            new.append(-lst[i])	## <state>new = CLRJ | lst = CLRJ | i = CLRJ</state>
        else:
            new.append(lst[i])	## <state>new = CLRJ | lst = CLRJ | i = CLRJ</state>
        i -= 1	## <state>i = CLRJ</state>
    return new	## <state>new = CLRJ</state>
