def f(lists):
    dic = {}	## dic = CLRJ
    for n in lists:	## n = CLRJ | lists = CLRJ
        if n in dic:	## n = CLRJ | dic = CLRJ
            dic[n].append(lists.pop(lists.index(n)))	## dic = CLRJ | n = CLRJ | lists = CLRJ
        else:
            dic[n] = lists[:lists.index(n) + 1]	## dic = CLRJ | n = CLRJ | lists = CLRJ
    return str(dic).replace(' ', '')	## dic = CLRJ
