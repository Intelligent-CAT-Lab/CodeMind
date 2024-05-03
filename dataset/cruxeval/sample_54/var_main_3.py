def f(text, s, e):
    sublist = text[s:e]	## <state>sublist = CLRJ | text = CLRJ | s = CLRJ | e = CLRJ</state>
    if not sublist:	## <state>sublist = CLRJ</state>
        return -1
    return sublist.index(min(sublist))	## <state>sublist = CLRJ</state>
