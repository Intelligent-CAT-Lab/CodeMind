def f(str, n):
    if len(str) < n:	## <state>str = CLRJ | n = CLRJ</state>
        return str	## <state>str = CLRJ</state>
    else:
        return str.removeprefix(str[:n])