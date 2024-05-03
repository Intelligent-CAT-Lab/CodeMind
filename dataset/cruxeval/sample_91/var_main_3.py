def f(s):
    d = dict.fromkeys(s, 0)	## <state>d = CLRJ | s = CLRJ</state>
    return list(d.keys())	## <state>d = CLRJ</state>
