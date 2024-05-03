def f(names, winners):
    ls = [names.index(name) for name in names if name in winners]	## ls = CLRJ | names = CLRJ | name = CLRJ | winners = CLRJ
    ls.sort(reverse=True)	## ls = CLRJ
    return ls	## ls = CLRJ
