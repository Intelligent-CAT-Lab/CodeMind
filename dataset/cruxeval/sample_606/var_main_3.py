def f(value):
    ls = list(value)	## <state>ls = CLRJ | value = CLRJ</state>
    ls.append('NHIB')	## <state>ls = CLRJ</state>
    return ''.join(ls)	## <state>ls = CLRJ</state>
