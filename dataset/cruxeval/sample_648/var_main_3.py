def f(list1, list2):
    l = list1[:]	## <state>l = CLRJ | list1 = CLRJ</state>
    while len(l) > 0:	## <state>l = CLRJ</state>
        if l[-1] in list2:	## <state>l = CLRJ | list2 = CLRJ</state>
            l.pop()
        else:
            return l[-1]	## <state>l = CLRJ</state>
    return 'missing'