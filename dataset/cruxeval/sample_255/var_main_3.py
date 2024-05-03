def f(text, fill, size):
    if size < 0:	## <state>size = CLRJ</state>
        size = -size
    if len(text) > size:	## <state>text = CLRJ | size = CLRJ</state>
        return text[len(text) - size:]	## <state>text = CLRJ | size = CLRJ</state>
    return text.rjust(size, fill)