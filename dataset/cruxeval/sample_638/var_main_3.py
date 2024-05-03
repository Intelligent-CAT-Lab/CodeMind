def f(s, suffix):
    if not suffix:	## <state>suffix = CLRJ</state>
        return s
    while s.endswith(suffix):	## <state>s = CLRJ | suffix = CLRJ</state>
        s = s[:-len(suffix)]
    return s	## <state>s = CLRJ</state>
