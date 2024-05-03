def f(s, n, c):
    width = len(c)*n	## <state>width = CLRJ | c = CLRJ | n = CLRJ</state>
    for _ in range(width - len(s)):	## <state>width = CLRJ | s = CLRJ</state>
        s = c + s
    return s	## <state>s = CLRJ</state>
