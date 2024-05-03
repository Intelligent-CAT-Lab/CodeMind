def f(strings, substr):
    list = [s for s in strings if s.startswith(substr)]	## list = CLRJ | s = CLRJ | strings = CLRJ | substr = CLRJ
    return sorted(list, key=len)	## list = CLRJ
