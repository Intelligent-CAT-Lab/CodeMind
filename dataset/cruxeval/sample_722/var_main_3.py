def f(text):
    out = ""	## <state>out = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i].isupper():	## <state>text = CLRJ | i = CLRJ</state>
            out += text[i].lower()	## <state>out = CLRJ | text = CLRJ | i = CLRJ</state>
        else:
            out += text[i].upper()	## <state>out = CLRJ | text = CLRJ | i = CLRJ</state>
    return out	## <state>out = CLRJ</state>
