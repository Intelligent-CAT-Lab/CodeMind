def f(text):
    if text == '42.42':	## <state>text = CLRJ</state>
        return True
    for i in range(3, len(text) - 3):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i] == '.' and text[i - 3:].isdigit() and text[:i].isdigit():	## <state>text = CLRJ | i = CLRJ</state>
            return True
    return False