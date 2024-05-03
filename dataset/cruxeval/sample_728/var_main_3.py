def f(text):
    result = []	## <state>result = CLRJ</state>
    for i, ch in enumerate(text):	## <state>i = CLRJ | ch = CLRJ | text = CLRJ</state>
        if ch == ch.lower():	## <state>ch = CLRJ</state>
            continue
        if len(text) - 1 - i < text.rindex(ch.lower()):
            result.append(ch)
    return ''.join(result)	## <state>result = CLRJ</state>
