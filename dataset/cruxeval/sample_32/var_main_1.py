def f(s, sep):
    reverse = ['*' + e for e in s.split(sep)]	## reverse = CLRJ | e = CLRJ | s = CLRJ | sep = CLRJ
    return ';'.join(reversed(reverse))	## reverse = CLRJ
