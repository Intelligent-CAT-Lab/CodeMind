def f(strings, substr):
    list = [s for s in strings if s.startswith(substr)]	## <state>list = CLRJ | s = CLRJ | strings = CLRJ | substr = CLRJ</state>
    return sorted(list, key=len)	## <state>list = CLRJ</state>
