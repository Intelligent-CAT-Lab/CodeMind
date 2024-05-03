def f(string, sep):
    cnt = string.count(sep)	## cnt = CLRJ | string = CLRJ | sep = CLRJ
    return((string+sep) * cnt)[::-1]	## string = CLRJ | sep = CLRJ | cnt = CLRJ
