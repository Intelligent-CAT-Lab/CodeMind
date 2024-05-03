def f(a, b):
    for key, value in b.items():	## <state>key = CLRJ | value = CLRJ | b = CLRJ</state>
        if key not in a:	## <state>key = CLRJ | a = CLRJ</state>
            a[key] = [value]	## <state>a = CLRJ | key = CLRJ | value = CLRJ</state>
        else:
            a[key].append(value)
    return a	## <state>a = CLRJ</state>
