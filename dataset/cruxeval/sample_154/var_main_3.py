def f(s, c):
    s = s.split(' ')	## <state>s = CLRJ</state>
    return ((c + "  ") + ("  ".join(s[::-1])))	## <state>c = CLRJ | s = CLRJ</state>
