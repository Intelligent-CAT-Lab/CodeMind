def f(s, sep):
    s += sep	## <state>s = CLRJ | sep = CLRJ</state>
    return s.rpartition(sep)[0]	## <state>s = CLRJ | sep = CLRJ</state>
