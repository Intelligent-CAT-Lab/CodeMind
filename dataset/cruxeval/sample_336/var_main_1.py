def f(s, sep):
    s += sep	## s = CLRJ | sep = CLRJ
    return s.rpartition(sep)[0]	## s = CLRJ | sep = CLRJ
