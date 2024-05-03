def f(a, b, n):
    result = m = b	## <state>result = CLRJ | m = CLRJ | b = CLRJ</state>
    for _ in range(n):	## <state>_ = CLRJ | n = CLRJ</state>
        if m:	## <state>m = CLRJ</state>
            a, m = a.replace(m, '', 1), None	## <state>a = CLRJ | m = CLRJ</state>
            result = m = b	## <state>result = CLRJ | m = CLRJ | b = CLRJ</state>
    return result.join(a.split(b))	## <state>result = CLRJ | a = CLRJ | b = CLRJ</state>
