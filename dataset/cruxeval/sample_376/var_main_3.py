def f(text):
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if text[0:i].startswith("two"):	## <state>text = CLRJ | i = CLRJ</state>
            return text[i:]
    return 'no'