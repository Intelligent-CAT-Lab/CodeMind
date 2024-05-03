def f(text):
    result = []	## <state>result = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if not text[i].isascii():	## <state>text = CLRJ | i = CLRJ</state>
            return False
        elif text[i].isalnum():	## <state>text = CLRJ | i = CLRJ</state>
            result.append(text[i].upper())	## <state>result = CLRJ | text = CLRJ | i = CLRJ</state>
        else:
            result.append(text[i])
    return ''.join(result)	## <state>result = CLRJ</state>
