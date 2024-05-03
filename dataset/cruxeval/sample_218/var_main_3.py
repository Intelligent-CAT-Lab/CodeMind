def f(string, sep):
    cnt = string.count(sep)	## <state>cnt = CLRJ | string = CLRJ | sep = CLRJ</state>
    return((string+sep) * cnt)[::-1]	## <state>string = CLRJ | sep = CLRJ | cnt = CLRJ</state>
