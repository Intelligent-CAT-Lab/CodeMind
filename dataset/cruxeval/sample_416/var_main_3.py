def f(text, old, new):
    index = text.rfind(old, 0, text.find(old))	## <state>index = CLRJ | text = CLRJ | old = CLRJ</state>
    result = list(text)	## <state>result = CLRJ | text = CLRJ</state>
    while index > 0:	## <state>index = CLRJ</state>
        result[index:index+len(old)] = new
        index = text.rfind(old, 0, index)
    return ''.join(result)	## <state>result = CLRJ</state>
