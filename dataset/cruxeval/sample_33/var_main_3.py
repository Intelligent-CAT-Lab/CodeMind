def f(lists):
    dic = {}	## <state>dic = CLRJ</state>
    for n in lists:	## <state>n = CLRJ | lists = CLRJ</state>
        if n in dic:	## <state>n = CLRJ | dic = CLRJ</state>
            dic[n].append(lists.pop(lists.index(n)))	## <state>dic = CLRJ | n = CLRJ | lists = CLRJ</state>
        else:
            dic[n] = lists[:lists.index(n) + 1]	## <state>dic = CLRJ | n = CLRJ | lists = CLRJ</state>
    return str(dic).replace(' ', '')	## <state>dic = CLRJ</state>
