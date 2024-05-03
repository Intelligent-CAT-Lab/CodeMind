def f(s, o):
    if s.startswith(o):	## <state>s = CLRJ | o = CLRJ</state>
        return s	## <state>s = CLRJ</state>
    return o + f(s, o[-2::-1])	## <state>o = CLRJ | s = CLRJ</state>
