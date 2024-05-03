def f(dic):
    dic_op = dic.copy()	## <state>dic_op = CLRJ | dic = CLRJ</state>
    for key, val in dic.items():	## <state>key = CLRJ | val = CLRJ | dic = CLRJ</state>
        dic_op[key] = val * val	## <state>dic_op = CLRJ | key = CLRJ | val = CLRJ</state>
    return dic_op	## <state>dic_op = CLRJ</state>
