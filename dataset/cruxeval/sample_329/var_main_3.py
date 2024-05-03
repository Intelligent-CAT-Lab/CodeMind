def f(text):
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i] == text[i].upper() and text[i-1].islower():	## <state>text = CLRJ | i = CLRJ</state>
            return True
    return False