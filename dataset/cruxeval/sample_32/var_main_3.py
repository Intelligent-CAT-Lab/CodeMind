def f(s, sep):
    reverse = ['*' + e for e in s.split(sep)]	## <state>reverse = CLRJ | e = CLRJ | s = CLRJ | sep = CLRJ</state>
    return ';'.join(reversed(reverse))	## <state>reverse = CLRJ</state>
