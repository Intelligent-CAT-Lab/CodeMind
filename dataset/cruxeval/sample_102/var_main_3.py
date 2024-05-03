def f(names, winners):
    ls = [names.index(name) for name in names if name in winners]	## <state>ls = CLRJ | names = CLRJ | name = CLRJ | winners = CLRJ</state>
    ls.sort(reverse=True)	## <state>ls = CLRJ</state>
    return ls	## <state>ls = CLRJ</state>
