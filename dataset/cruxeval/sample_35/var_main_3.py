def f(pattern, items):
    result = []	## <state>result = CLRJ</state>
    for text in items:	## <state>text = CLRJ | items = CLRJ</state>
        pos = text.rfind(pattern)	## <state>pos = CLRJ | text = CLRJ | pattern = CLRJ</state>
        if pos >= 0:	## <state>pos = CLRJ</state>
            result.append(pos)

    return result	## <state>result = CLRJ</state>
