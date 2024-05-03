def f(n):
    n = str(n)	## <state>n = CLRJ</state>
    return n[0] + '.'+n[1:].replace('-', '_')	## <state>n = CLRJ</state>
