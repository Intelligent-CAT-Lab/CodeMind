def f(text, old, new):
    if len(old) > 3:	## <state>old = CLRJ</state>
        return text
    if old in text and ' ' not in text:	## <state>old = CLRJ | text = CLRJ</state>
        return text.replace(old, new*len(old))	## <state>text = CLRJ | old = CLRJ | new = CLRJ</state>
    while old in text:
        text = text.replace(old, new)
    return text