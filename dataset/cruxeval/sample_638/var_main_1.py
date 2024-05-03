def f(s, suffix):
    if not suffix:	## suffix = CLRJ
        return s
    while s.endswith(suffix):	## s = CLRJ | suffix = CLRJ
        s = s[:-len(suffix)]
    return s	## s = CLRJ
