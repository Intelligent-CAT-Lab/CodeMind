def f(text):
    i = (len(text) + 1) // 2	## <state>i = CLRJ | text = CLRJ</state>
    result = list(text)	## <state>result = CLRJ | text = CLRJ</state>
    while i < len(text):	## <state>i = CLRJ | text = CLRJ</state>
        t = result[i].lower()	## <state>t = CLRJ | result = CLRJ | i = CLRJ</state>
        if t == result[i]:	## <state>t = CLRJ | result = CLRJ | i = CLRJ</state>
            i += 1	## <state>i = CLRJ</state>
        else:
            result[i] = t	## <state>result = CLRJ | i = CLRJ | t = CLRJ</state>
        i += 2	## <state>i = CLRJ</state>
    return ''.join(result)	## <state>result = CLRJ</state>
