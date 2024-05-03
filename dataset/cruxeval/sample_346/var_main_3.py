def f(filename):
    suffix = filename.split('.')[-1]	## <state>suffix = CLRJ | filename = CLRJ</state>
    f2 = filename + suffix[::-1]	## <state>f2 = CLRJ | filename = CLRJ | suffix = CLRJ</state>
    return f2.endswith(suffix)	## <state>f2 = CLRJ | suffix = CLRJ</state>
